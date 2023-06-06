# Cafe Business Logic

## Ninja Bonuses!

### void printPriceChart(String product, double price, int maxQuantity)

Given a product, price and a maxQuantity, create a method that prints the cost for buying 1, then the price for buying 2, then for 3.. and so on, up to the max. For example, if the product is "Columbian Coffee Grounds" with a price of 15.0 and maxQuantity of 3, you should print:

```
Columbian Coffee Grounds
1 - $15.00
2 - $30.00
3 - $45.00
```

Tip: You can use the escape character \n within your string for line breaks.
Sensei bonus: Format the prices as currency. Hint: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

Senpai Bonus: Take $0.50 more off of the original price every time the quantity increases. Example: Given a $2.00 price and 4 max, where the prices would normally be $2, $4, $6 and $8, the discount would yield $2, $3.50, $5, and $6.50, progressively taking off $0.50, then $1, then $1.50 from the group tag price:

```
1 - $2.00
2 - $3.50
3 - $5.00
4 - $6.50
```

### boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices)

Let's overload the display menu! Given 2 arrays, an ArrayList of menu items (strings), and an ArrayList of prices (doubles) print a menu!

However, first check: if the arrays are not the same size, immediately return false.

To print the menu, iterate from 0 to the last index. Each time through, print on the same line:

a.) The index, b.) The menu item at that index, and c.) The price at that index.
Finally, return true.

Sample output:

```
0 drip coffee -- $1.50
1 cappucino -- $3.50
2 latte -- $4.50
3 mocha -- $3.50
```

## Sensei Bonus!

Make a method addCustomers where a barista can enter multiple customers. Hint: You can use a while loop and ask the user to type "q" when they are finished entering names.
