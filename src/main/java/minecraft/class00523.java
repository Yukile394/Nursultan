package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import org.jspecify.annotations.Nullable;

record class00523(String id, class06763<?> argumentType, class01894 suggestionId) implements class00508 {
   @Nullable
   public class01894 L() {
      return this.suggestionId;
   }

   class00523(String id, class06763<?> argumentType, @Nullable class01894 suggestionId) {
      this.id = id;
      this.argumentType = argumentType;
      this.suggestionId = suggestionId;
   }

   public class06763<?> y() {
      return this.argumentType;
   }

   @Override
   public void N(class00667 var1) {
      var1.N(this.id);
      N(var1, this.argumentType);
      if (this.suggestionId != null) {
         var1.N(this.suggestionId);
      }
   }

   public String N() {
      return this.id;
   }

   private static <A extends ArgumentType<?>> void N(class00667 var0, class06763<A> var1) {
      N(var0, var1.N(), var1);
   }

   private static <A extends ArgumentType<?>, T extends class06763<A>> void N(class00667 var0, class06799<A, T> var1, class06763<A> var2) {
      var0.L(class04206.t.N(var1));
      var1.N((T)var2, var0);
   }

   @Override
   public <S> ArgumentBuilder<S, ?> N(class04348 var1, class07263<S> var2) {
      ArgumentType argumenttype = this.argumentType.y(var1);
      return var2.N(this.id, argumenttype, this.suggestionId);
   }
}
