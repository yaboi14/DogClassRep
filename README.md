+------------------------+
|         Dog            |
+------------------------+
| - personality: String  |
| - name: String         |
| - hairColor: String    |
| - breed: String        |
| - age: int             |
| - howBig: String       |
| - owner: Owner         |
+------------------------+
| + Dog(personality: String, name: String,                   |
|       hairColor: String, breed: String,                    |
|       age: int, howBig: String, owner: Owner)              |
| + Dog(name: String, breed: String)                         |
| + getPersonality(): String                                 |
| + setPersonality(String): void                             |
| + getName(): String                                        |
| + setName(String): void                                    |
| + getHairColor(): String                                   |
| + setHairColor(String): void                               |
| + getBreed(): String                                       |
| + setBreed(String): void                                   |
| + getAge(): int                                            |
| + setAge(int): void                                        |
| + getHowBig(): String                                      |
| + setHowBig(String): void                                  |
| + getOwner(): Owner                                        |
| + setOwner(Owner): void                                    |
| + bark(): void                                             |
| + eat(food: String): void                                  |
| + playWith(toy: String): void                              |
| + celebrateBirthday(): void                                |
| + toString(): String                                       |
+------------------------------------------------------------+
                |
                | 1
                |-------------------
                                1
+------------------------+
|        Owner           |
+------------------------+
| - name: String         |
| - contactInfo: String  |
+------------------------+
| + Owner(name: String, contactInfo: String) |
| + getters/setters...                       |
+------------------------+
