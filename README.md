# magicNumbers
# armstrong-numbers
Мои два примитивных способа нахождения чисел армстронга (есть ограничение вместимостью лонг !!!). 
Вначале хотел пояснить что это за хитрые такие числа: Число Армстронга - натуральное число, которое в данной системе счисления равно сумме своих цифр, возведённых в степень, равную количеству его цифр. Пример: 13 + 53 + 33 = 153.
Первый способ: перебирал числа от 1 до N (число задано в условии моей задачи). находил числа, удовлетворяющие равенству формулы выше. заносил их в список.
Второй способ: подготовил заранее список с числами армстронга (гугл в этом мне помог). с помощью перебора списка в цикле и сравнения полученных чисел с данным числом N ( где N > полученного числа). все числа , удовлетвориющие условию складывал в пустой список.
Этот пост не обучающий !!! Решил сохранить себе на память , так как очень понравились эти числа и задача (данная мне с обучающего сайта). 
/////////////////////////////////////// 
My two primitive ways of finding armstrong numbers (there is a limit to the capacity of long !!!). 
First I wanted to explain what kind of tricky numbers these are: Armstrong number is a natural number, 
which in this number system is equal to the sum of its digits raised to a power equal to the number of its digits. Example: 13 + 53 + 33 = 153.
The first method: I went through the numbers from 1 to N (the number is given in the condition of my problem). I found numbers satisfying the equality of the formula above. I put them on the list.
The second way: I prepared a list with Armstrong numbers in advance (Google helped me with this). by iterating through the list in a loop and comparing the obtained numbers with the given number N (where N > the obtained number). 
All the numbers satisfying the condition were added to an empty list.
This post is not educational !!! I decided to keep it as a souvenir, as I really liked these numbers and the task (given to me from the training site).

# constant Kaprekar
Число 6174 имеет следующую особенность. Выберем любое четырёхзначное число n, больше 1000, в котором не все цифры одинаковы (всюду предполагается использование десятичной системы счисления, если не оговорено иное). 
Расположим цифры сначала в порядке возрастания, затем в порядке убывания. Вычтем из большего меньшее. Производя перестановки цифр и вычитания, нули следует сохранять. Описанное действие назовём функцией Капрекара K(n). 
Повторяя этот процесс с получающимися разностями, не более чем за семь шагов получим число 6174, которое будет затем воспроизводить само себя.
Это свойство числа 6174 было открыто в 1949 году индийским математиком Д. Р. Капрекаром, в честь которого оно и получило своё название.
///////////////////////////////////////
The number 6174 has the following feature. Let's choose any four-digit number n, greater than 1000, in which not all digits are the same (the decimal system is assumed to be used everywhere, unless otherwise specified). 
Let's arrange the numbers first in ascending order, then in descending order. Subtract the smaller from the larger. 
When making permutations of digits and subtractions, zeros should be saved. The described action is called the Kaprekar function K(n). Repeating this process with the resulting differences, in no more than seven steps we will get the number 6174, which will then reproduce itself.
This property of the number 6174 was discovered in 1949 by the Indian mathematician D. R. Kaprekar, after whom it got its name.
