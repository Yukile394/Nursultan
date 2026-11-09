package minecraft;

record class00916(class06889 center, float radius, int blockCount, class04540<class00931> blockParticles) {

   public int L() {
      return this.blockCount;
   }

   class00916(class06889 center, float radius, int blockCount, class04540<class00931> blockParticles) {
      this.center = center;
      this.radius = radius;
      this.blockCount = blockCount;
      this.blockParticles = blockParticles;
   }

   public class04540<class00931> u() {
      return this.blockParticles;
   }

   public float y() {
      return this.radius;
   }

   public class06889 N() {
      return this.center;
   }
}
