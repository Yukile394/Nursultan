package minecraft;

import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.helpers.FakeChainedJsonException;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04195 extends IOException {
   private final List<class02085> field_13371 = Lists.newArrayList();
   private final String field_13372;

   public class04195(String var1) {
      super();
      this.field_13371.add(new class02085());
      this.field_13372 = var1;
   }

   public class04195(String var1, Throwable var2) {
      super(var2);
      this.field_13371.add(new class02085());
      this.field_13372 = var1;
   }

   @Override
   public String getMessage() {
      return "Invalid " + this.field_13371.get(this.field_13371.size() - 1) + ": " + this.field_13372;
   }

   public void method_12854(String var1) {
      this.field_13371.get(0).N(var1);
   }

   public void method_12855(String var1) {
      this.field_13371.get(0).N = var1;
      this.field_13371.add(0, new class02085());
   }

   public static class04195 method_12856(Exception var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      handler$bck000$iris$changeShaderParseException(var0, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class04195)callbackinforeturnable.getReturnValue();
      } else if (var0 instanceof class04195) {
         return (class04195)var0;
      } else {
         String s = var0.getMessage();
         if (var0 instanceof FileNotFoundException) {
            s = "File not found";
         }

         return new class04195(s, var0);
      }
   }

   private static void handler$bck000$iris$changeShaderParseException(Exception var0, CallbackInfoReturnable var1) {
      if (var0 instanceof ShaderCompileException shadercompileexception) {
         var1.setReturnValue(new FakeChainedJsonException(shadercompileexception));
      }
   }
}
