package minecraft;

import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class class07676 implements BuiltInExceptionProvider {
   private static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("argument.double.low", var1, var0));
   private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("argument.double.big", var1, var0));
   private static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("argument.float.low", var1, var0));
   private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("argument.float.big", var1, var0));
   private static final Dynamic2CommandExceptionType i = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("argument.integer.low", var1, var0));
   private static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("argument.integer.big", var1, var0));
   private static final Dynamic2CommandExceptionType M = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("argument.long.low", var1, var0));
   private static final Dynamic2CommandExceptionType B = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("argument.long.big", var1, var0));
   private static final DynamicCommandExceptionType Z = new DynamicCommandExceptionType(var0 -> class00392.y("argument.literal.incorrect", var0));
   private static final SimpleCommandExceptionType z = new SimpleCommandExceptionType(class00392.L("parsing.quote.expected.start"));
   private static final SimpleCommandExceptionType U = new SimpleCommandExceptionType(class00392.L("parsing.quote.expected.end"));
   private static final DynamicCommandExceptionType E = new DynamicCommandExceptionType(var0 -> class00392.y("parsing.quote.escape", var0));
   private static final DynamicCommandExceptionType W = new DynamicCommandExceptionType(var0 -> class00392.y("parsing.bool.invalid", var0));
   private static final DynamicCommandExceptionType m = new DynamicCommandExceptionType(var0 -> class00392.y("parsing.int.invalid", var0));
   private static final SimpleCommandExceptionType P = new SimpleCommandExceptionType(class00392.L("parsing.int.expected"));
   private static final DynamicCommandExceptionType s = new DynamicCommandExceptionType(var0 -> class00392.y("parsing.long.invalid", var0));
   private static final SimpleCommandExceptionType T = new SimpleCommandExceptionType(class00392.L("parsing.long.expected"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType(var0 -> class00392.y("parsing.double.invalid", var0));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(class00392.L("parsing.double.expected"));
   private static final DynamicCommandExceptionType v = new DynamicCommandExceptionType(var0 -> class00392.y("parsing.float.invalid", var0));
   private static final SimpleCommandExceptionType n = new SimpleCommandExceptionType(class00392.L("parsing.float.expected"));
   private static final SimpleCommandExceptionType t = new SimpleCommandExceptionType(class00392.L("parsing.bool.expected"));
   private static final DynamicCommandExceptionType G = new DynamicCommandExceptionType(var0 -> class00392.y("parsing.expected", var0));
   private static final SimpleCommandExceptionType l = new SimpleCommandExceptionType(class00392.L("command.unknown.command"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(class00392.L("command.unknown.argument"));
   private static final SimpleCommandExceptionType w = new SimpleCommandExceptionType(class00392.L("command.expected.separator"));
   private static final DynamicCommandExceptionType k = new DynamicCommandExceptionType(var0 -> class00392.y("command.exception", var0));

   public class07676() {
      super();
   }

   public Dynamic2CommandExceptionType longTooLow() {
      return M;
   }

   public DynamicCommandExceptionType readerInvalidEscape() {
      return E;
   }

   public DynamicCommandExceptionType readerExpectedSymbol() {
      return G;
   }

   public SimpleCommandExceptionType readerExpectedDouble() {
      return j;
   }

   public DynamicCommandExceptionType dispatcherParseException() {
      return k;
   }

   public DynamicCommandExceptionType readerInvalidDouble() {
      return b;
   }

   public SimpleCommandExceptionType readerExpectedFloat() {
      return n;
   }

   public SimpleCommandExceptionType readerExpectedStartOfQuote() {
      return z;
   }

   public SimpleCommandExceptionType readerExpectedEndOfQuote() {
      return U;
   }

   public SimpleCommandExceptionType dispatcherUnknownCommand() {
      return l;
   }

   public SimpleCommandExceptionType dispatcherUnknownArgument() {
      return d;
   }

   public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
      return w;
   }

   public DynamicCommandExceptionType literalIncorrect() {
      return Z;
   }

   public Dynamic2CommandExceptionType doubleTooLow() {
      return N;
   }

   public Dynamic2CommandExceptionType longTooHigh() {
      return B;
   }

   public DynamicCommandExceptionType readerInvalidLong() {
      return s;
   }

   public SimpleCommandExceptionType readerExpectedLong() {
      return T;
   }

   public DynamicCommandExceptionType readerInvalidFloat() {
      return v;
   }

   public Dynamic2CommandExceptionType integerTooHigh() {
      return R;
   }

   public SimpleCommandExceptionType readerExpectedInt() {
      return P;
   }

   public SimpleCommandExceptionType readerExpectedBool() {
      return t;
   }

   public Dynamic2CommandExceptionType doubleTooHigh() {
      return y;
   }

   public Dynamic2CommandExceptionType floatTooLow() {
      return L;
   }

   public Dynamic2CommandExceptionType floatTooHigh() {
      return u;
   }

   public Dynamic2CommandExceptionType integerTooLow() {
      return i;
   }

   public DynamicCommandExceptionType readerInvalidBool() {
      return W;
   }

   public DynamicCommandExceptionType readerInvalidInt() {
      return m;
   }
}
