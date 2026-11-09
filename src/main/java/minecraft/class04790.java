package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import java.util.List;
import java.util.function.Function;
import net.caffeinemc.mods.sodium.client.render.frapi.render.OrderedSubmitNodeCollectorExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class04790 implements class01237, OrderedSubmitNodeCollectorExtension {
   private final Int2ObjectAVLTreeMap<class07937> N = new Int2ObjectAVLTreeMap();

   public Int2ObjectAVLTreeMap<class07937> L() {
      return this.N;
   }

   public class04790() {
      super();
   }

   public void y() {
      this.N.values().removeIf(var0 -> !var0.m());
      this.N.values().forEach(class07937::s);
   }

   public class07937 N(int var1) {
      return (class07937)this.N.computeIfAbsent(var1, var1x -> new class07937(this));
   }

   @Override
   public void N(class05436 var1) {
      this.N(0).N(var1);
   }

   @Override
   public void N(class01421 var1, class07311 var2, class00999 var3) {
      this.N(0).N(var1, var2, var3);
   }

   @Override
   public void N(class01421 var1, class07311 var2, class08887 var3, float var4, float var5, float var6, int var7, int var8, int var9) {
      this.N(0).N(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   public void N(class01421 var1, class03662 var2, int var3, int var4, int var5, int[] var6, List<class02022> var7, class07311 var8, class08915 var9) {
      this.N(0).N(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public void N() {
      this.N.values().forEach(class07937::P);
   }

   @Override
   public void N(class01421 var1, class08804 var2) {
      this.N(0).N(var1, var2);
   }

   @Override
   public void N(class01421 var1, class08800 var2, Quaternionf var3) {
      this.N(0).N(var1, var2, var3);
   }

   @Override
   public void N(class01421 var1, float var2, float var3, class01028 var4, boolean var5, class01583 var6, int var7, int var8, int var9, int var10) {
      this.N(0).N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @Override
   public void N(class01421 var1, @Nullable class06889 var2, int var3, class00392 var4, boolean var5, int var6, double var7, class06959 var9) {
      this.N(0).N(var1, var2, var3, var4, var5, var6, var7, var9);
   }

   @Override
   public void N(class01421 var1, float var2, List<class08453> var3) {
      this.N(0).N(var1, var2, var3);
   }

   @Override
   public void N(class01421 var1, class07942 var2) {
      this.N(0).N(var1, var2);
   }

   @Override
   public void N(class01421 var1, class00500 var2, int var3, int var4, int var5) {
      this.N(0).N(var1, var2, var3, var4, var5);
   }

   @Override
   public void N(
      class01686 var1,
      class01421 var2,
      class07311 var3,
      int var4,
      int var5,
      @Nullable class08388 var6,
      boolean var7,
      boolean var8,
      int var9,
      @Nullable class08141 var10,
      int var11
   ) {
      this.N(0).N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @Override
   public <S> void N(
      class06271<? super S> var1,
      S var2,
      class01421 var3,
      class07311 var4,
      int var5,
      int var6,
      int var7,
      @Nullable class08388 var8,
      int var9,
      @Nullable class08141 var10
   ) {
      this.N(0).N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public void fabric_submitItem(
      class01421 var1,
      class03662 var2,
      int var3,
      int var4,
      int var5,
      int[] var6,
      List var7,
      class07311 var8,
      class08915 var9,
      MeshView var10,
      ItemRenderTypeGetter var11
   ) {
      class07937 class07937 = this.N(0);
      if (class07937 instanceof OrderedSubmitNodeCollectorExtension) {
         class07937.fabric_submitItem(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      } else {
         class07937.N(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   public void submitBlock(class01421 var1, class00500 var2, int var3, int var4, int var5, class07295 var6, class07209 var7) {
      this.N(0).submitBlock(var1, var2, var3, var4, var5, var6, var7);
   }

   public void submitBlockStateModel(
      class01421 var1,
      Function var2,
      class08887 var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      int var9,
      class07295 var10,
      class07209 var11,
      class00500 var12
   ) {
      this.N(0).submitBlockStateModel(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }
}
