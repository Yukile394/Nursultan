package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class class01215 {
   private static final Codec<class01215> field_39266 = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.k.fieldOf("id").forGetter(class01215::method_43936), Codec.BOOL.optionalFieldOf("required", true).forGetter(var0x -> var0x.field_39268)
         )
         .apply(var0, class01215::new)
   );
   public static final Codec<class01215> field_39265 = Codec.either(class06338.k, field_39266)
      .xmap(
         var0 -> (class01215)var0.map(var0x -> new class01215(var0x, true), var0x -> var0x),
         var0 -> var0.field_39268 ? Either.left(var0.method_43936()) : Either.right(var0)
      );
   public final class01894 field_15584;
   public final boolean field_39267;
   public final boolean field_39268;

   public void method_32831(Consumer<class01894> var1) {
      if (this.field_39267 && this.field_39268) {
         var1.accept(this.field_15584);
      }
   }

   private class06359 method_43936() {
      return new class06359(this.field_15584, this.field_39267);
   }

   public <T> boolean method_26790(class01208<T> var1, Consumer<T> var2) {
      if (this.field_39267) {
         Collection collection = var1.method_43949(this.field_15584);
         if (collection == null) {
            return !this.field_39268;
         }

         collection.forEach(var2);
      } else {
         Object object = var1.method_43948(this.field_15584, this.field_39268);
         if (object == null) {
            return !this.field_39268;
         }

         var2.accept(object);
      }

      return true;
   }

   public void method_43944(Consumer<class01894> var1) {
      if (this.field_39267 && !this.field_39268) {
         var1.accept(this.field_15584);
      }
   }

   private class01215(class06359 var1, boolean var2) {
      super();
      this.field_15584 = var1.N();
      this.field_39267 = var1.y();
      this.field_39268 = var2;
   }

   public class01215(class01894 var1, boolean var2, boolean var3) {
      super();
      this.field_15584 = var1;
      this.field_39267 = var2;
      this.field_39268 = var3;
   }

   @Override
   public String toString() {
      StringBuilder stringbuilder = new StringBuilder();
      if (this.field_39267) {
         stringbuilder.append('#');
      }

      stringbuilder.append(this.field_15584);
      if (!this.field_39268) {
         stringbuilder.append('?');
      }

      return stringbuilder.toString();
   }

   public static class01215 method_43937(class01894 var0) {
      return new class01215(var0, false, true);
   }

   public static class01215 method_43947(class01894 var0) {
      return new class01215(var0, true, false);
   }

   public static class01215 method_43945(class01894 var0) {
      return new class01215(var0, true, true);
   }

   public static class01215 method_43942(class01894 var0) {
      return new class01215(var0, false, false);
   }

   public boolean method_32832(Predicate<class01894> var1, Predicate<class01894> var2) {
      return !this.field_39268 || (this.field_39267 ? var2 : var1).test(this.field_15584);
   }
}
