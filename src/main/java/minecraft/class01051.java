package minecraft;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class01051 {
   private final Deque<class03255> N = new ArrayDeque<>();

   class01051() {
      super();
   }

   @Nullable
   public class03255 y() {
      return this.N.peekLast();
   }

   public boolean N(int var1, int var2) {
      return this.N.isEmpty() ? true : this.N.peek().N(var1, var2);
   }

   @Nullable
   public class03255 N() {
      if (this.N.isEmpty()) {
         throw new IllegalStateException("Scissor stack underflow");
      } else {
         this.N.removeLast();
         return this.N.peekLast();
      }
   }

   public class03255 N(class03255 var1) {
      class03255 class03255x = this.N.peekLast();
      if (class03255x != null) {
         class03255 class03255x = Objects.requireNonNullElse(var1.y(class03255x), class03255.N());
         this.N.addLast(class03255x);
         return class03255x;
      } else {
         this.N.addLast(var1);
         return var1;
      }
   }
}
