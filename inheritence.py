# Parent class (Base class)
class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        return "Animal makes a sound"

# Child class (Derived class)
class Dog(Animal):
    def speak(self):
        return f"{self.name} says Woof!"

# Child class (Derived class)
class Cat(Animal):
    def speak(self):
        return f"{self.name} says Meow!"

# Creating objects of child classes
dog = Dog("Buddy")
cat = Cat("Whiskers")

# Calling the speak() method
print(dog.speak())  # Output: Buddy says Woof!
print(cat.speak())  # Output: Whiskers says Meow!
