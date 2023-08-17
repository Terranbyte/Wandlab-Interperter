# Wandlab-Interperter
An interpreter for a esoteric programming language based on ANTLR-4

# What is this?
Wandlab is an esoteric programming language that lets you write programs in the form of spell sequences that are cast by a wand. A wand contains a sequence of spells that alter its state and, in turn, defines programmable behaviour. This language was inspired by the wand building mechanics from in Noita.

# How do I write stuff?
### Warning: This section might be out-of-date, but it's still mostly applicable.
The simplest sequence spell is a freeform spell with no respells or arguments, to cast these you simply write out its name, if another spell comes after it, add a dash to the end (Example: "Zeta-Eta"). To bind a respell to a freeform spell you first write the freeform spell, plus the caret (^) symbol, followed by the respell (Example: "Delta^Sigma"). Some spells require an argument. To pass a literal as an arugment, write a pipe (|), followed by the argument. To pass a rune as an argument, add a pipe (|), then an arrow symbol (->) before the rune index (Example: "Pi|0|->4"). Some spells take runes as arguments, for these you don't need to add an arrow symbol. The Lambda and Sigma spells need to encapsulate other spells to function. To create the encapsulation, surround some number of spells with square brackets ([]) (Example: "Lambda[Pi|0|1]").
	
# What does X mean?
Here's a list of definitions relating to this language.

>**Wand:** Contains spells that define a program.
>**Rune:** A variable either taking the form of a numeric literal (32-bit unsigned integer) or a text literal (UTF-32 string).
Working data type: Defines what type the current value is interpreted as. It defaults to the type of a spells specified rune or the argument passed to it, but can be changed with the Aplha and Beta spells.
	
>**Spell:** A general term used to refer to the different operations that take place in a wand. Spells can take one of two states, freeform and spellbound.
>**Super spell:** A spell that alters a wands internal state. Super spells cannot be spellbound.
>**Respell:** A spell that alters one or more spells inside a wand. Respells cannot be freeform unless it has defined freeform behaviour.
>**Meta spell:** A sequence of spells encapsulated by a freeform Lambda spell.
	
>**Freeform:** A freeform spell simply exists on its own inside a wand.
>**Spellbound:** A spellbound spell is tied to a freeform spell. When bound, it alters the behaviour of the freeform spell bound to it. A freeform spell can only contain one spellbind.
>**Spell sequence:** A list of spells that define a wands program.
>**Sequence spell:** An spell inside a spell sequence.
>**Spell leak:** Spell leak occurs when a spell tries to alter a wands internal state in a way that would break it, for example if a spell tries to change a value that doesn't exist or if a Delta spell tries to skip outside the bounds of the current scope. If a spell leak occurs, the wand breaks and the spell sequence is terminated.

# Spell list
>### Super spells:
* **Xi**: Indents a rune with a value.
* **Omicron:** Indents a rune with data from the input. It defaults to numeric literals.
* **Omega:** Prints the value of a rune or Gamma to the output.

* **Mu:** Swaps the values of the first rune with the second rune.
* **Pi:** Takes a rune and a number and adds them together. The result is then stored in the rune.

<br>

* **Alpha:** Forces the data type of the next spell to be numeric literal.
* **Beta:** Forces the data type of the next spell to be text literal.

<br>

* **Lambda:** Encapsulats other spells turning them into a meta spell.
* **Sigma:** Encapsulats other spells, turning them into a meta spell. When cast, it randomly chooses one of the spells inside the meta spell and casts it. Casting Sigma doesn't change the current scope.

<br>

* **Delta:** Skips forward Gamma number of spell. If it doesn't have Gamma spellbound, it defaults to 1.
* **Eta:** Casts the next spell if the specified rune is equal (==) to the second argument.
* **Zeta:** Casts the next spell if the specified rune is greater than (>) the second argument.

<br>

>### Respells:
* **Gamma:** Provides literals for certain spells.
* **Chi:** Provides a randomly generated number from 0 to the first argument (inclusive). Can be used in-place Gamma literals.
* **Tau:** Repeats a spell Gamma number of times.
* **Phi:** Inverts the operation of the spellbound spell.

# Example programs

## Hello world
```
Omega^Gamma|"Hello World"
```

## Truth-machine
```
Omicron|0-/ If rune[0] == 0: print rune[0] forever. Else: print rune[0] once. /Eta|->0|1-Lambda[Omega|->0-Delta|1^Phi]-Omega|->0
```

## Multiply two numbers
```
Omicron|0-Omicron|1-Lambda[Pi|3|->0]^Tau|->1
```

## Nested meta spell example
```
Lambda[Lambda[Lambda[Omega|"Hello"]-Omega|"world"]-Omega|"!"]
```

## Nested pointer example
```
Xi|0|1-Xi|1|2-Xi|3|"Hello world!"-Omega|->->->0
```
