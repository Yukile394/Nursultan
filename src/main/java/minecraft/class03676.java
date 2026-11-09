package minecraft;

record class03676(int maxInfoRows, boolean alwaysMaxHeight) {

   class03676(int maxInfoRows, boolean alwaysMaxHeight) {
      super();
      this.maxInfoRows = maxInfoRows;
      this.alwaysMaxHeight = alwaysMaxHeight;
   }

   public boolean y() {
      return this.alwaysMaxHeight;
   }

   public int N() {
      return this.maxInfoRows;
   }
}
