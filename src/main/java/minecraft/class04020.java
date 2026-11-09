package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.List;

public class class04020 {
   public static final class04017 N = N(0, false, class02258.field_29314);
   public static final class04017 y = N(0, true, class02258.field_29314);
   public static final class04017 L = N(0, true, 6, class02258.field_29314);
   public static final class04017 u = N(0, true, 30, class02258.field_29314);
   public static final class04017 i = N(0, false, class02258.field_29313);
   public static final class04017 R = N(0, true, class02258.field_29313);

   public static class04017 L() {
      return class03035.field_35600;
   }

   public class04020() {
      super();
   }

   public static class03028 i() {
      return class04036.field_35225;
   }

   public static class04017 u() {
      return class03017.field_35260;
   }

   public static class04017 y(int var0, int var1) {
      return new class03033(var0, var1, true);
   }

   public static class04017 y(class06055 var0, int var1) {
      return new class03022(var0, var1, true);
   }

   public static class04017 y() {
      return class04040.field_35243;
   }

   public static class03028 N(class04017 var0, class03028 var1) {
      return new class03013(var0, var1);
   }

   public static class04017 N(int var0, boolean var1, class02258 var2) {
      return new class03037(var0, var1, 0, var2);
   }

   public static class04017 N(class05946<class05056> var0, double var1, double var3) {
      return new class03011(var0, var1, var3);
   }

   public static class03028 N(class03028... var0) {
      if (var0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new class03010(Arrays.asList(var0));
      }
   }

   public static class03028 N(class00500 var0) {
      return new class04047(var0);
   }

   static <A> MapCodec<? extends A> N(class00751<MapCodec<? extends A>> var0, String var1, class03979<? extends A> var2) {
      return class00751.N(var0, var1, var2.N());
   }

   public static class04034 N(List<class05946<class00780>> var0) {
      return new class04034(var0);
   }

   @SafeVarargs
   public static class04017 N(class05946<class00780>... var0) {
      return N(List.of(var0));
   }

   public static class04017 N(int var0, int var1) {
      return new class03033(var0, var1, false);
   }

   public static class04017 N(class06055 var0, int var1) {
      return new class03022(var0, var1, false);
   }

   public static class04017 N(class04017 var0) {
      return new class03034(var0);
   }

   public static class04017 N() {
      return class03020.field_35254;
   }

   public static class04017 N(String var0, class06055 var1, class06055 var2) {
      return new class03005(class01894.N(var0), var1, var2);
   }

   public static class04017 N(int var0, boolean var1, int var2, class02258 var3) {
      return new class03037(var0, var1, var2, var3);
   }

   public static class04017 N(class05946<class05056> var0, double var1) {
      return N(var0, var1, Double.MAX_VALUE);
   }
}
