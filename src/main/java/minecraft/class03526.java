package minecraft;

import java.util.ArrayDeque;
import java.util.Deque;

public class class03526 extends class03171 {
   private final Deque<class03173> N = new ArrayDeque<>();

   public class03526(class03152... var1) {
      super();
      class03173 class03173 = class03173.N();

      for (class03152 class03152 : var1) {
         class03173.N(class03152);
      }

      this.N.push(class03173);
   }

   @Override
   public class03154 y() {
      if (this.i() == this.N.element().y()) {
         this.N.pop();
      }

      return super.y();
   }

   @Override
   public class03153 N(class01424<?> var1, String var2) {
      class03173 class03173x = this.N.element();
      if (class03173x.N(var1, var2)) {
         return class03153.field_36249;
      } else {
         if (var1 == class07001.y) {
            class03173 class03173x = class03173x.u().get(var2);
            if (class03173x != null) {
               this.N.push(class03173x);
            }
         }

         return super.N(var1, var2);
      }
   }
}
