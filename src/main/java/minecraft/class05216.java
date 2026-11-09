package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public final class class05216 implements class00392 {
   private final class04439 N;
   private final List<class00392> y;
   private class00405 i;
   private class01028 R = class01028.N;
   @Nullable
   private class07018 M;

   public class05216 L(class00405 var1) {
      this.y(var1.N(this.method_10866()));
      return this;
   }

   @Override
   public class00405 method_10866() {
      return this.i;
   }

   @Override
   public List<class00392> method_10855() {
      return this.y;
   }

   class05216(class04439 var1, List<class00392> var2, class00405 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.i = var3;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class05216 class05216 && this.N.equals(class05216.N) && this.i.equals(class05216.i) && this.y.equals(class05216.y);
   }

   @Override
   public String toString() {
      StringBuilder stringbuilder = new StringBuilder(this.N.toString());
      boolean flag = !this.i.B();
      boolean flag1 = !this.y.isEmpty();
      if (flag || flag1) {
         stringbuilder.append('[');
         if (flag) {
            stringbuilder.append("style=");
            stringbuilder.append(this.i);
         }

         if (flag && flag1) {
            stringbuilder.append(", ");
         }

         if (flag1) {
            stringbuilder.append("siblings=");
            stringbuilder.append(this.y);
         }

         stringbuilder.append(']');
      }

      return stringbuilder.toString();
   }

   @Override
   public int hashCode() {
      int ix = 1;
      ix = 31 * ix + this.N.hashCode();
      ix = 31 * ix + this.i.hashCode();
      return 31 * ix + this.y.hashCode();
   }

   public class05216 i(String var1) {
      return var1.isEmpty() ? this : this.y(class00392.y(var1));
   }

   public class05216 y(class00405 var1) {
      this.i = var1;
      return this;
   }

   public class05216 y(int var1) {
      this.y(this.method_10866().N(var1));
      return this;
   }

   public class05216 y(class00392 var1) {
      this.y.add(var1);
      return this;
   }

   public class05216 N(class06541 var1) {
      this.y(this.method_10866().y(var1));
      return this;
   }

   public class05216 N(UnaryOperator<class00405> var1) {
      this.y(var1.apply(this.method_10866()));
      return this;
   }

   public class05216 N(class06541... var1) {
      this.y(this.method_10866().N(var1));
      return this;
   }

   public static class05216 N(class04439 var0) {
      return new class05216(var0, Lists.newArrayList(), class00405.N);
   }

   public class05216 R() {
      this.y(this.method_10866().W());
      return this;
   }

   @Override
   public class01028 method_30937() {
      class07018 class07018 = class07018.y();
      if (this.M != class07018) {
         this.R = class07018.N(this);
         this.M = class07018;
      }

      return this.R;
   }

   @Override
   public class04439 method_10851() {
      return this.N;
   }
}
