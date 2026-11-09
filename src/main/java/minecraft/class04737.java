package minecraft;

record class04737(class00392 title, class00392 detail) {

   class04737(class00392 title, class00392 detail) {
      this.title = title;
      this.detail = detail;
   }

   public class00392 y() {
      return this.detail;
   }

   public class00392 N() {
      return this.title;
   }

   static class04737 N(class05097 var0) {
      class05108 class05108 = var0.N;
      return new class04737(class00392.N("mco.errorMessage.realmsService.realmsError", class05108.N()), class05108.y());
   }
}
