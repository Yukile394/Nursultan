package minecraft;

public record class08963(class04891 spinHeadSound, class04891 hurtSound, class04891 deathSound, class04891 stepSound, class01894 texture, class01894 eyeTexture) {
   public class04891 L() {
      return this.deathSound;
   }

   public class08963(class04891 spinHeadSound, class04891 hurtSound, class04891 deathSound, class04891 stepSound, class01894 texture, class01894 eyeTexture) {
      this.spinHeadSound = spinHeadSound;
      this.hurtSound = hurtSound;
      this.deathSound = deathSound;
      this.stepSound = stepSound;
      this.texture = texture;
      this.eyeTexture = eyeTexture;
   }

   public class01894 i() {
      return this.texture;
   }

   public class04891 u() {
      return this.stepSound;
   }

   public class04891 y() {
      return this.hurtSound;
   }

   public class04891 N() {
      return this.spinHeadSound;
   }

   public class01894 R() {
      return this.eyeTexture;
   }
}
