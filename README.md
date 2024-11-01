# triangleclass_encapsulation_in_java
A Java program that demonstrates the principles of encapsulation and object-oriented design through the implementation of a Triangle class. This project ensures that only valid triangles can be represented by the class by enforcing constraints on side lengths, enhancing both usability and data integrity.

Features:
• Encapsulation of Side Lengths: Uses private instance variables for side lengths (sideA, sideB, sideC) and provides public accessors (getters) and mutators (setters) to control their values.
• Triangle Validity Constraints:
    - Ensures each side is positive.
    - Enforces the triangle inequality: the sum of any two sides must be greater than the third side.
• Default Handling for Invalid Triangles: When invalid side lengths are provided, the triangle defaults to a valid configuration using a constant DEFAULT_SIDE_LENGTH.
• Custom String Representation: Implements a toString method for easy printing of triangles, rounding values to the thousandths place.

Triangle Class Methods:
- Constructor: Initializes a triangle with provided side lengths, or defaults to valid values if constraints are not met.
- Accessors (Getters): getSideA, getSideB, getSideC provide read-only access to each side length.
- Mutators (Setters): setSideA, setSideB, setSideC allow side length updates, only if the new value maintains triangle validity.
- toString: Formats the triangle’s side lengths into a readable string with up to three decimal places.

Usage Example (Driver Class):
A Driver class demonstrates usage by:
1. Creating a valid triangle.
2. Modifying side lengths using mutators while enforcing constraints.
3. Handling invalid triangles by defaulting to valid side lengths.
4. Printing each state to verify correct functionality.

How to Run:
1. Setup: Clone the repository and import it into your IDE (e.g., Eclipse).
2. Execute: Run the Driver class to see the Triangle class in action.
