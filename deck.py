# class Card:
#     def __init__(self, value, color):
#         self.value = value
#         self.color = color

# colors = ['heart', 'diamonds', 'spades', 'clubs']

# import itertools
# import random
 

# vals = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'jack', 'queen', 'king', 'ace']
# suits = ['spades', 'clubs', 'hearts', 'diamonds']

# deck = list(itertools.product(vals, suits))

# random.shuffle(deck)
# i=0
# for val, suit in deck:
#     print('%s The %s of %s' % (i, val, suit))
#     i+=1


from enum import Enum

class Values(Enum):
	ACE = 1
	TWO = 2
	THREE = 3
	FOUR = 4
	FIVE = 5
	SIX = 6
	SEVEN = 7
	EIGHT = 8
	NINE = 9
	TEN = 10
	JACK = 11
	QUEEN = 12
	KING = 13

# print(repr(Value.ACE))
for value in Values:
	print(value)