package minecraft;

import org.apache.commons.lang3.mutable.MutableObject;

record class04867(class05236 piece, MutableObject<class00494> free, int depth) {

   public int L() {
      return this.depth;
   }

   class04867(class05236 piece, MutableObject<class00494> free, int depth) {
      super();
      this.piece = piece;
      this.free = free;
      this.depth = depth;
   }

   public MutableObject<class00494> y() {
      return this.free;
   }

   public class05236 N() {
      return this.piece;
   }
}
