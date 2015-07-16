# Release-Branch erzeugen mit integrierten Hook-Branches
* Release-Branch: pa-release-6.2.1-ga2
* Hook-Branch-1: branch-liferay-portal-open-graph-6.2.1-ga2 (existiert)
* Hook-Branch-2: branch-liferay-portal-pa-6.2.1-ga2 (existiert)

| Befehl   |      Begründung/Anmerkungen      | 
|:----------|:-------------|
| git clone https://github.com/PolitAktiv/liferay-portal.git | Klont des Repositories; dauert sehr lange (über 2Mio Files)  | 
| git fetch |    Holt Informationen über Remote Branches und Tags   |  
| git branch -va | Zeigt aktuelle Informationen über Branches an |
|git checkout 6.2.1-ga2|Wechselt auf den 6.2.1-ga2 Tag; konkret definierter und benannter Repository-Zustand, in welchen auch die Hooks injiziert wurden|
|git checkout -b pa-release-6.2.1-ga2|Erstellt Release-Branch lokal|
|git checkout -b branch-liferay-portal-open-graph-6.2.1-ga2 remotes/origin/branch-liferay-portal-open-graph-6.2.1-ga2| Erstellt lokalen Hook-Branch-1, der den entsprechenden Remote-Hook-Branch trackt|
|git checkout -b branch-liferay-portal-pa-6.2.1-ga2 remotes/origin/branch-liferay-portal-pa-6.2.1-ga2|Erstellt den  lokalen Hook-Branch-2, der entsprechend den anderen Remote-Hook-Branch trackt|
|git checkout pa-release-6.2.1-ga2|Wechsle in den lokalen Release-Branch|
|git rebase branch-liferay-portal-open-graph-6.2.1-ga2|Ändert die Basis des momentanen Branches (Release-Branch) auf den angegebenen Branch (Hook-Branch-1). D.h. die Commits, die auf Hook-Branch-1 gemacht wurden, werden mit dem Release-Branch gemerged. Der Release-Branch enthält nun die Hooks von Hook-Branch-1|
|git rebase branch-liferay-portal-pa-6.2.1-ga2|Ändert die Basis des momentanen Branches (Release-Branch) auf den angegebenen Branch (Hook-Branch-2). D.h. die Commits, die auf Hook-Branch-2 gemacht wurden, werden mit dem Release-Branch gemerged, welcher wiederum als Basis den Hook-Branch-1 hat. Der Release-Branch enthält nun die Hooks von Hook-Branch-1 und Hook-Branch-2 ... |
| [Fehlermeldung: Merge Conflict] | ... jedenfalls theoretisch. Im vorliegende Fall wird der rebase-Vorgang unterbrochen, da zwei Files im Konflikt stehen, nämlich /portal-impl/src/content/Language_en.properties und /portal-impl/src/content/Language_de.properties, welche in den unterschiedlichen Hooks unterschiedliche Inhalte aufweisen, die nächsten Schritte sind ... |
|vi /portal-impl/src/content/Language_en.properties|... manuell mergen werden. D.h. File so zusammenstellen, wie gewünscht und die git-Merge-Marker entfernen (<<<, === und >>>). Konkretere Anleitung: https://help.github.com/articles/resolving-a-merge-conflict-from-the-command-line/|
|vi /portal-impl/src/content/Language_de.properties|manuelles Mergen muss bei allen Konflikten erfolgen|
|git add /portal-impl/src/content/Language_en.properties|Fügt die manuelle Änderung der Language_en.properties dem Index hinzu|
|git add /portal-impl/src/content/Language_de.properties|Fügt die manuelle Änderung der Language_de.properties dem Index hinzu|
|git rebase --continue|Beendet das Rebasing, jetzt enthält der Release-Branch die Hooks von beiden Hook-Branches|
|git push origin pa-release-6.2.1-ga2|Füge den bisher lokalen Release-Branch dem Remote-Repository hinzu|
