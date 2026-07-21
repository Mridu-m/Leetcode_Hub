# Intuition

Profit = Selling Price - Buying Price

To maximize the profit:

1. The buying day must always come before the selling day.
   buy index < sell index

2. The buying price should be as small as possible.

3. For every day, imagine today is the selling day.
   Then ask:
   "What is the minimum price I have seen before today?"

4. If I already know the minimum price so far, I don't need to search all previous days again.

5. Calculate today's profit:
   currentProfit = currentPrice - minimumPriceSoFar

6. Keep updating the maximum profit.

Therefore, I only need two variables:
- minimumPriceSoFar
- maximumProfit
