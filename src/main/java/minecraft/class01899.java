package minecraft;

record class01899(class07312 levelSettings, class05934 options, class00751<class01255> existingDimensions) {

   public class00751<class01255> L() {
      return this.existingDimensions;
   }

   class01899(class07312 levelSettings, class05934 options, class00751<class01255> existingDimensions) {
      this.levelSettings = levelSettings;
      this.options = options;
      this.existingDimensions = existingDimensions;
   }

   public class05934 y() {
      return this.options;
   }

   public class07312 N() {
      return this.levelSettings;
   }
}
