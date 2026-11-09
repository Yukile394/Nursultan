package minecraft;

import com.mojang.blaze3d.shaders.ShaderType;

record class08205(class01894 id, ShaderType type) {
   class08205(class01894 id, ShaderType type) {
      super();
      this.id = id;
      this.type = type;
   }

   @Override
   public String toString() {
      return this.id + " (" + this.type + ")";
   }

   public ShaderType y() {
      return this.type;
   }

   public class01894 N() {
      return this.id;
   }
}
