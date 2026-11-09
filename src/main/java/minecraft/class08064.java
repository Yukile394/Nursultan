package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class class08064<T extends Enum<T> & class05033> extends class08092<T> {
   private final List<T> N;
   private final Map<String, T> y;
   private final int[] L;

   private class08064(String var1, Class<T> var2, List<T> var3) {
      super(var1, var2);
      if (var3.isEmpty()) {
         throw new IllegalArgumentException("Trying to make empty EnumProperty '" + var1 + "'");
      } else {
         this.N = List.copyOf(var3);
         Enum[] aenum = (Enum[])var2.getEnumConstants();
         this.L = new int[aenum.length];

         for (Enum oenum : aenum) {
            this.L[oenum.ordinal()] = var3.indexOf(oenum);
         }

         Builder builder = ImmutableMap.builder();

         for (Enum oenum1 : var3) {
            String s = ((class05033)oenum1).method_15434();
            builder.put(s, oenum1);
         }

         this.y = builder.buildOrThrow();
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof class08064 class08064 && super.equals(var1) ? this.N.equals(class08064.N) : false;
      }
   }

   @Override
   public int y() {
      int i = super.y();
      return 31 * i + this.N.hashCode();
   }

   @Override
   public Optional<T> y(String var1) {
      return Optional.ofNullable(this.y.get(var1));
   }

   public int y(T var1) {
      return this.L[var1.ordinal()];
   }

   public static <T extends Enum<T> & class05033> class08064<T> N(String var0, Class<T> var1, List<T> var2) {
      return new class08064<>(var0, var1, var2);
   }

   public static <T extends Enum<T> & class05033> class08064<T> N(String var0, Class<T> var1) {
      return N(var0, var1, var0x -> true);
   }

   public String N(T var1) {
      return ((class05033)var1).method_15434();
   }

   @Override
   public List<T> N() {
      return this.N;
   }

   public static <T extends Enum<T> & class05033> class08064<T> N(String var0, Class<T> var1, Predicate<T> var2) {
      return N(var0, var1, Arrays.stream((Enum[])var1.getEnumConstants()).filter(var2).collect(Collectors.toList()));
   }

   @SafeVarargs
   public static <T extends Enum<T> & class05033> class08064<T> N(String var0, Class<T> var1, T... var2) {
      return N(var0, var1, List.of((T[])var2));
   }
}
