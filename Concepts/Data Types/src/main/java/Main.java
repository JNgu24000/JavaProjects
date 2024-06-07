class Main {
  public static void main(String[] args) {
byte by = 127;
byte min = -128;
System.out.println(by);
System.out.println(min);

short s = 32_767;
short minShort = -32768;
System.out.println(s);
System.out.println(minShort);

int i = 2_147_483_647;
int negativeI = -2_147_483_648;
System.out.println(i);
System.out.println(negativeI);

long l = 9_223_372_036_854_775_807L;
System.out.println(l);

double d = 3839.34839;
System.out.println(d);

float f = 3839.34839F;
float pif = 3.14f;
System.out.println(f);
System.out.println(pif);

boolean on = false;
boolean off = true;
System.out.println(on);
System.out.println(off);

char c = 'a';
char z = 'z';
System.out.println(c);
System.out.println(z);

String sentence = "the quick brown fox jumps over the lazy dog";
System.out.println(sentence);

String newSentence = "I mastered Java data types!";
System.out.println(newSentence);
  } // End of Main method
} // End of Main class