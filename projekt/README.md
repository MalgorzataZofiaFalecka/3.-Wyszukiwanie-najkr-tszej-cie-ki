3.Wyszukiwanie najkrótszej ścieżki 

[SPIS TREŚCI]
[projekt
(.idea)
(.idea/.gitignore)
(.idea/jpa-buddy.xml)
(.idea/misc.xml)
(.idea/modules.xml)
(.idea/workspace.xml)
(out)
(out/production/projekt/ArrayManager.class)
(out/production/projekt/ArrayManager$Direction.class)
(out/production/projekt/Main.class)
(out/production/projekt/PathsStorage.class)
(src)
(src/ArrayManager.java)
(src/Main.java)
(src/PathsStorage.java)
(projekt.iml)
(README.md)
]


Lista i krótki opis zaimplementowanych funkcjonalności:
Wymiary tablicy odczytywane są z konsoli przy użyciu obiektu "Scanner".
Klasa "ArrayManager" używana jest do wykonywania operacji na tablicy, takich jak wypełnienie jej liczbami podanymi przez użytkownika czy odnalezienie najlepszej trasy.
Sam algorytm wyszukiwania trasy polega na rekurencyjnym wywoływaniu metody "calculateShortestPathForRoot", która oblicza wszystkie możliwe trasy i zapisuje tą, która jest najbardziej odpowiednia.
Do przechowywania danych stworzono klasę "PathStorage", która przechowuje najlepszą trasę i jej wartość oraz aktualnie obliczaną trasę.

Instrukcja obsługi:
Program można uruchomić za pomocą dowolnego IDE javy.
Program napisany z użyciem Javy 17
