package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.model.loading.UnbakedModelJsonDeserializer;
import net.fabricmc.fabric.mixin.client.model.loading.BlockModelAccessor;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public record class04237(class08534 geometry, class00140 guiLight, Boolean ambientOcclusion, class03702 transforms, class08814 textureSlots, class01894 parent)
   implements class00167,
   BlockModelAccessor {
   static final Gson y = N(
         new GsonBuilder()
            .registerTypeAdapter(class04237.class, new class04212())
            .registerTypeAdapter(class02081.class, new class02069())
            .registerTypeAdapter(class02067.class, new class02047())
            .registerTypeAdapter(class03265.class, new class03273())
            .registerTypeAdapter(class03702.class, new class03698())
      )
      .create();

   public class04237(
      @Nullable class08534 geometry,
      @Nullable class00140 guiLight,
      @Nullable Boolean ambientOcclusion,
      @Nullable class03702 transforms,
      class08814 textureSlots,
      @Nullable class01894 parent
   ) {
      this.geometry = geometry;
      this.guiLight = guiLight;
      this.ambientOcclusion = ambientOcclusion;
      this.transforms = transforms;
      this.textureSlots = textureSlots;
      this.parent = parent;
   }

   private static GsonBuilder N(GsonBuilder var0) {
      return var0.registerTypeHierarchyAdapter(class00167.class, new UnbakedModelJsonDeserializer());
   }

   public static class04237 N(Reader var0) {
      return class05001.N(y, var0, class04237.class);
   }

   @Nullable
   @Override
   public Boolean comp_3741() {
      return this.ambientOcclusion;
   }

   @Override
   public class08814 comp_3743() {
      return this.textureSlots;
   }

   @Nullable
   @Override
   public class01894 comp_3744() {
      return this.parent;
   }

   @Nullable
   @Override
   public class03702 comp_3742() {
      return this.transforms;
   }

   @Nullable
   @Override
   public class00140 comp_3740() {
      return this.guiLight;
   }

   @Nullable
   @Override
   public class08534 comp_3739() {
      return this.geometry;
   }
}
