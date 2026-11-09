package minecraft;

record class02744(float partialTicksInStep, class02769 currentStep, class02769 previousStep) {

   public class02769 L() {
      return this.previousStep;
   }

   class02744(float partialTicksInStep, class02769 currentStep, class02769 previousStep) {
      this.partialTicksInStep = partialTicksInStep;
      this.currentStep = currentStep;
      this.previousStep = previousStep;
   }

   public class02769 y() {
      return this.currentStep;
   }

   public float N() {
      return this.partialTicksInStep;
   }
}
