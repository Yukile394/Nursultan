package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class class03164 extends class03171 {
   private int N;
   private final Set<class01424<?>> y;
   private final Deque<class03173> L = new ArrayDeque<>();

   public int L() {
      return this.N;
   }

   public class03164(class03152... var1) {
      super();
      this.N = var1.length;
      Builder builder = ImmutableSet.builder();
      class03173 class03173 = class03173.N();

      for (class03152 class03152 : var1) {
         class03173.N(class03152);
         builder.add(class03152.y());
      }

      this.L.push(class03173);
      builder.add(class07001.y);
      this.y = builder.build();
   }

   @Override
   public class03154 y() {
      if (this.i() == this.L.element().y()) {
         this.L.pop();
      }

      return super.y();
   }

   @Override
   public class03154 y(class01424<?> var1) {
      return var1 != class07001.y ? class03154.field_36255 : super.y(var1);
   }

   @Override
   public class03153 N(class01424<?> var1, String var2) {
      class03173 class03173x = this.L.element();
      if (this.i() > class03173x.y()) {
         return super.N(var1, var2);
      } else if (class03173x.L().remove(var2, var1)) {
         this.N--;
         return super.N(var1, var2);
      } else {
         if (var1 == class07001.y) {
            class03173 class03173x = class03173x.u().get(var2);
            if (class03173x != null) {
               this.L.push(class03173x);
               return super.N(var1, var2);
            }
         }

         return class03153.field_36249;
      }
   }

   @Override
   public class03153 N(class01424<?> var1) {
      class03173 class03173 = this.L.element();
      if (this.i() > class03173.y()) {
         return super.N(var1);
      } else if (this.N <= 0) {
         return class03153.field_36250;
      } else {
         return !this.y.contains(var1) ? class03153.field_36249 : super.N(var1);
      }
   }
}
