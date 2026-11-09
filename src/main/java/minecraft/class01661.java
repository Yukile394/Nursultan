package minecraft;

record class01661(class01676 storage, class01672 events) {

   class01661(class02959 var1) {
      this(new class01676(var1), new class01672());
   }

   private class01661(class01676 storage, class01672 events) {
      this.storage = storage;
      this.events = events;
   }

   public class01672 y() {
      return this.events;
   }

   public class01676 N() {
      return this.storage;
   }
}
