package minecraft;

import it.unimi.dsi.fastutil.ints.IntSet;
import org.jspecify.annotations.Nullable;

public record class00487(class00508 stub, int flags, int redirect, int[] children) {

   public int L() {
      return this.redirect;
   }

   class00487(@Nullable class00508 stub, int flags, int redirect, int[] children) {
      super();
      this.stub = stub;
      this.flags = flags;
      this.redirect = redirect;
      this.children = children;
   }

   public int[] u() {
      return this.children;
   }

   public boolean y(IntSet var1) {
      for (int i : this.children) {
         if (var1.contains(i)) {
            return false;
         }
      }

      return true;
   }

   public int y() {
      return this.flags;
   }

   @Nullable
   public class00508 N() {
      return this.stub;
   }

   public void N(class00667 var1) {
      var1.writeByte(this.flags);
      var1.N(this.children);
      if ((this.flags & 8) != 0) {
         var1.L(this.redirect);
      }

      if (this.stub != null) {
         this.stub.N(var1);
      }
   }

   public boolean N(IntSet var1) {
      return (this.flags & 8) != 0 ? !var1.contains(this.redirect) : true;
   }
}
