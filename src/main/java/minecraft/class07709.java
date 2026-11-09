package minecraft;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Optional;

public sealed interface class07709 permits class07001, class07023, class08884, class06997 {
   int u = 8;
   int i = 12;
   int R = 4;
   int M = 28;
   byte B = 0;
   byte Z = 1;
   byte z = 2;
   byte U = 3;
   byte E = 4;
   byte W = 5;
   byte m = 6;
   byte P = 7;
   byte s = 8;
   byte T = 9;
   byte b = 10;
   byte j = 11;
   byte v = 12;
   int n = 512;

   byte L();

   default Optional<Number> P() {
      return Optional.empty();
   }

   default Optional<Short> T() {
      return this.P().map(Number::shortValue);
   }

   @Override
   String toString();

   default Optional<Integer> b() {
      return this.P().map(Number::intValue);
   }

   default Optional<Byte> s() {
      return this.P().map(Number::byteValue);
   }

   default Optional<Double> n() {
      return this.P().map(Number::doubleValue);
   }

   default Optional<Boolean> t() {
      return this.s().map(var0 -> var0 != 0);
   }

   default Optional<Float> v() {
      return this.P().map(Number::floatValue);
   }

   default Optional<Long> j() {
      return this.P().map(Number::longValue);
   }

   class01424<?> u();

   int y();

   default void y(class03175 var1) {
      if (var1.y(this.u()) == class03154.field_36253) {
         this.N(var1);
      }
   }

   class07709 N();

   void N(class04836 var1);

   class03154 N(class03175 var1);

   void N(DataOutput var1) throws IOException;

   default Optional<byte[]> R() {
      return Optional.empty();
   }

   default Optional<int[]> ai_() {
      return Optional.empty();
   }

   default Optional<class07001> ak_() {
      return Optional.empty();
   }

   default Optional<class07741> al_() {
      return Optional.empty();
   }

   default Optional<long[]> aj_() {
      return Optional.empty();
   }

   default Optional<String> ah_() {
      return Optional.empty();
   }
}
