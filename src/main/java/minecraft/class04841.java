package minecraft;

record class04841(class01894 fontId, String pack, int index) {
   public int L() {
      return this.index;
   }

   class04841(class01894 fontId, String pack, int index) {
      super();
      this.fontId = fontId;
      this.pack = pack;
      this.index = index;
   }

   @Override
   public String toString() {
      return "(" + this.fontId + ": builder #" + this.index + " from pack " + this.pack + ")";
   }

   public String y() {
      return this.pack;
   }

   public class01894 N() {
      return this.fontId;
   }
}
