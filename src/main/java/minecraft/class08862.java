package minecraft;

import com.mojang.blaze3d.shaders.ShaderType;

record class08862(class01894 id, ShaderType type, class08227 defines) {

   public class08227 L() {
      return this.defines;
   }

   class08862(class01894 id, ShaderType type, class08227 defines) {
      super();
      this.id = id;
      this.type = type;
      this.defines = defines;
   }

   @Override
   public String toString() {
      String s = this.id + " (" + this.type + ")";
      return !this.defines.L() ? s + " with " + this.defines : s;
   }

   public ShaderType y() {
      return this.type;
   }

   public class01894 N() {
      return this.id;
   }
}
