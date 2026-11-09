package Nursultan;

public record class09163(float yawDelta, float pitchDelta) {

   class09163(float yawDelta, float pitchDelta) {
      this.yawDelta = yawDelta;
      this.pitchDelta = pitchDelta;
   }

   public float y() {
      return this.pitchDelta;
   }

   public float N() {
      return this.yawDelta;
   }
}
