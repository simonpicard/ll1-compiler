package scanner;

public enum LexicalUnit{
	LESS_OR_EQUALS_THAN,
	GREATER_OR_EQUALS_THAN,
	ARITHMETIC_SHIFT_RIGHT,
	ARITHMETIC_SHIFT_LEFT,
	EQUALITY,
	INEQUALITY,
	MAP_TO,
	LAZY_AND,
	LAZY_OR,
	TYPE_DEFINITION,
	POWER,
	REMAINDER,
	BITWISE_NOT,
	BITWISE_AND,
	BITWISE_OR,
	BITWISE_XOR,
	TERNARY_IF,
	NEGATION,
	TERNARY_ELSE,
	END_OF_INSTRUCTION,
	INVERSE_DIVIDE,
	COMMA,
	LEFT_PARENTHESIS,
	RIGHT_PARENTHESIS,
	MINUS,
	PLUS,
	ASSIGNATION,
	TIMES,
	DIVIDE,
	LESS_THAN,
	GREATER_THAN,
	WHILE,
	FOR,
	PRINTLN,
	CONST,
	LET,
	FUNCTION,
	RETURN,
	BOOLEAN_TYPE,
	REAL_TYPE,
	INTEGER_TYPE,
	INTEGER_CAST,
	REAL_CAST,
	READ_INTEGER,
	READ_REAL,
	BOOLEAN_CAST,
	DO,
	END,
	IF,
	ELSE,
	ELSE_IF,
	BOOLEAN,
	INTEGER,
	REAL,
	IDENTIFIER,
	END_OF_STREAM
}