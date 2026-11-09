package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.datafixers.util.Either;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public interface class00392 extends class05936, Message {
   @Override
   default String getString() {
      return class05936.super.getString();
   }

   default class05216 L() {
      return new class05216(this.method_10851(), new ArrayList<>(this.method_10855()), this.method_10866());
   }

   static class05216 L(String var0) {
      return class05216.N(new class00388(var0, null, class00388.N));
   }

   class00405 method_10866();

   List<class00392> method_10855();

   static class05216 i() {
      return class05216.N(class01751.L);
   }

   default List<class00392> u() {
      return this.N(class00405.N);
   }

   static class05216 u(String var0) {
      return class05216.N(new class00413(var0));
   }

   static class05216 y(String var0) {
      return class05216.N(class01751.y(var0));
   }

   static class05216 y(String var0, Object... var1) {
      for (int i = 0; i < var1.length; i++) {
         Object object = var1[i];
         if (!class00388.N(object) && !(object instanceof class00392)) {
            var1[i] = String.valueOf(object);
         }
      }

      return N(var0, var1);
   }

   static class05216 y(String var0, String var1) {
      return class05216.N(new class00421(Either.right(var0), var1));
   }

   default class05216 y() {
      return class05216.N(this.method_10851());
   }

   static class05216 N(class00926 var0) {
      return class05216.N(new class00923(var0));
   }

   static class00392 N(Date var0) {
      return y(var0.toString());
   }

   static class00392 N(Message var0) {
      return (class00392)(var0 instanceof class00392 ? (class00392)var0 : y(var0.getString()));
   }

   static class05216 N(class08262 var0, Optional<class00392> var1) {
      return class05216.N(new class00414(var0, var1));
   }

   static class05216 N(class08262 var0, String var1) {
      return class05216.N(new class00421(Either.left(var0), var1));
   }

   static class05216 N(String var0, boolean var1, Optional<class00392> var2, class04457 var3) {
      return class05216.N(new class00418(var0, var1, var2, var3));
   }

   static class00392 N(URI var0) {
      return y(var0.toString());
   }

   static class00392 N(class07321 var0) {
      return y(var0.toString());
   }

   static class00392 N(class01894 var0) {
      return y(var0.toString());
   }

   static class00392 N(UUID var0) {
      return y(var0.toString());
   }

   static class05216 N(String var0, Object... var1) {
      return class05216.N(new class00388(var0, null, var1));
   }

   @Override
   default <T> Optional<T> N_8(class05977<T> var1) {
      Optional optional = this.method_10851().method_27659(var1);
      if (optional.isPresent()) {
         return optional;
      } else {
         Iterator<class00392> iterator = this.method_10855().iterator();

         while (iterator.hasNext()) {
            Optional optional1 = iterator.next().N_8(var1);
            if (optional1.isPresent()) {
               return optional1;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> N(class05935<T> var1, class00405 var2) {
      class00405 class00405 = this.method_10866().N(var2);
      Optional optional = this.method_10851().method_27660(var1, class00405);
      if (optional.isPresent()) {
         return optional;
      } else {
         Iterator<class00392> iterator = this.method_10855().iterator();

         while (iterator.hasNext()) {
            Optional optional1 = iterator.next().N(var1, class00405);
            if (optional1.isPresent()) {
               return optional1;
            }
         }

         return Optional.empty();
      }
   }

   static class00392 N(@Nullable String var0) {
      return (class00392)(var0 != null ? y(var0) : class05220.N);
   }

   default boolean N(class00392 var1) {
      if (this.equals(var1)) {
         return true;
      } else {
         List<class00392> list = this.u();
         List<class00392> list1 = var1.N(this.method_10866());
         return Collections.indexOfSubList(list, list1) != -1;
      }
   }

   default List<class00392> N(class00405 var1) {
      ArrayList arraylist = Lists.newArrayList();
      this.N((var1x, var2x) -> {
         if (!var2x.isEmpty()) {
            arraylist.add(y(var2x).L(var1x));
         }

         return Optional.empty();
      }, var1);
      return arraylist;
   }

   default String N(int var1) {
      StringBuilder stringbuilder = new StringBuilder();
      this.N_8(var2x -> {
         int i = var1 - stringbuilder.length();
         if (i <= 0) {
            return L;
         } else {
            stringbuilder.append(var2x.length() <= i ? var2x : var2x.substring(0, i));
            return Optional.empty();
         }
      });
      return stringbuilder.toString();
   }

   @Nullable
   default String N() {
      return this.method_10851() instanceof class01751 class01751 && this.method_10855().isEmpty() && this.method_10866().B() ? class01751.comp_737() : null;
   }

   static class05216 N(String var0, @Nullable String var1, Object... var2) {
      return class05216.N(new class00388(var0, var1, var2));
   }

   static class05216 N(String var0, @Nullable String var1) {
      return class05216.N(new class00388(var0, var1, class00388.N));
   }

   class01028 method_30937();

   class04439 method_10851();
}
