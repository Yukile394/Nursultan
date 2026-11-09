package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import net.caffeinemc.mods.sodium.client.render.frapi.render.MeshItemCommand;
import net.caffeinemc.mods.sodium.client.render.frapi.render.OrderedSubmitNodeCollectorExtension;
import net.caffeinemc.mods.sodium.client.render.frapi.render.SubmitNodeCollectionExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import net.fabricmc.fabric.impl.renderer.BatchingRenderCommandQueueExtension;
import net.fabricmc.fabric.impl.renderer.ExtendedBlockCommand;
import net.fabricmc.fabric.impl.renderer.ExtendedBlockStateModelCommand;
import net.irisshaders.iris.layer.BlockEntityRenderStateShard;
import net.irisshaders.iris.layer.OuterWrappedRenderType;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class07937 implements class07926, OrderedSubmitNodeCollectorExtension, SubmitNodeCollectionExtension, BatchingRenderCommandQueueExtension {
   private final List<class08130> N;
   private final List<class06031> y;
   private final class08112 L;
   private final List<class08113> u;
   private final List<class08146> i;
   private final List<class01143> R;
   private final List<class08121> M;
   private final List<class06327> B;
   private final List<class08109> Z;
   private final List<class05436> z;
   private final class08103 U;
   private final class07928 E;
   private final class08143 W;
   private final class04790 m;
   private boolean P;
   private final List s = new ArrayList();
   private final List T = new ArrayList();
   private final List b = new ArrayList();

   public class08112 L() {
      return this.L;
   }

   public List<class08121> M() {
      return this.M;
   }

   public void P() {
      this.N.clear();
      this.y.clear();
      this.L.N();
      this.u.clear();
      this.i.clear();
      this.R.clear();
      this.M.clear();
      this.B.clear();
      this.Z.clear();
      this.z.clear();
      this.U.N();
      this.W.N();
      this.E.N();
      this.y(null);
      this.N(null);
   }

   public class07937(class04790 var1) {
      super();
      this.N = new ArrayList<>();
      this.y = new ArrayList<>();
      this.L = new class08112();
      this.u = new ArrayList<>();
      this.i = new ArrayList<>();
      this.R = new ArrayList<>();
      this.M = new ArrayList<>();
      this.B = new ArrayList<>();
      this.Z = new ArrayList<>();
      this.z = new ArrayList<>();
      this.U = new class08103();
      this.E = new class07928();
      this.W = new class08143();
      this.P = false;
      this.m = var1;
   }

   public List<class06327> B() {
      return this.B;
   }

   public class07928 Z() {
      return this.E;
   }

   public List<class08146> i() {
      return this.i;
   }

   public void s() {
      this.U.y();
      this.E.y();
      this.W.y();
      this.P = false;
   }

   public boolean m() {
      return this.P;
   }

   public List<class05436> U() {
      return this.z;
   }

   public List<class08109> z() {
      return this.Z;
   }

   public List<class08113> u() {
      return this.u;
   }

   private void y(class01421 var1, class07311 var2, class00999 var3) {
      this.P = true;
      this.W.N(var1, var2, var3);
   }

   private void y(class06271 var1, Object var2, class01421 var3, class07311 var4, int var5, int var6, int var7, class08388 var8, int var9, class08141 var10) {
      this.P = true;
      class08107 class08107 = new class08107<>(var3.L().u(), var1, var2, var5, var6, var7, var8, var9, var10);
      class08103 class08103 = this.U;
      this.N(
         class08103,
         var4,
         class08107,
         var0 -> {
            WrapOperationRuntime.checkArgumentCount(
               var0, 3, "[net.minecraft.class_11683$class_12048, net.minecraft.class_1921, net.minecraft.class_11661$class_11670]"
            );
            ((class08103)var0[0]).N((class07311)var0[1], (class08107<?>)var0[2]);
            return (Void)null;
         }
      );
   }

   private void y(CallbackInfo var1) {
      this.s.clear();
      this.T.clear();
   }

   private boolean y(List var1, Object var2, Operation var3) {
      ((ModelStorage)var2).iris$capture();
      return (Boolean)var3.call(new Object[]{var1, var2});
   }

   public List<class06031> y() {
      return this.y;
   }

   public class08103 E() {
      return this.U;
   }

   private boolean N(List var1, Object var2, Operation var3) {
      ((ModelStorage)var2).iris$capture();
      return (Boolean)var3.call(new Object[]{var1, var2});
   }

   public void N(CallbackInfo var1) {
      this.b.clear();
   }

   private void N(
      class06271 var1,
      Object var2,
      class01421 var3,
      class07311 var4,
      int var5,
      int var6,
      int var7,
      class08388 var8,
      int var9,
      class08141 var10,
      Operation var11
   ) {
      if (ImmediateState.isRenderingBEs) {
         var4 = OuterWrappedRenderType.wrapExactlyOnce("iris:block_entity", (class07311)var4, BlockEntityRenderStateShard.INSTANCE);
      }

      var11.call(new Object[]{var1, var2, var3, var4, var5, var6, var7, var8, var9, var10});
   }

   private void N(class08103 var1, class07311 var2, class08107 var3, Operation var4) {
      var3.iris$capture();
      var4.call(new Object[]{var1, var2, var3});
   }

   private void N(class01421 var1, class07311 var2, class00999 var3, Operation var4) {
      if (ImmediateState.isRenderingBEs) {
         var2 = OuterWrappedRenderType.wrapExactlyOnce("iris:block_entity", (class07311)var2, BlockEntityRenderStateShard.INSTANCE);
      }

      var4.call(new Object[]{var1, var2, var3});
   }

   @Override
   public void N(class01421 var1, float var2, List<class08453> var3) {
      this.P = true;
      class01423 class01423 = var1.L();
      this.N.add(new class08130(new Matrix4f(class01423.N()), var2, var3));
   }

   private void N(class07928 var1, class07311 var2, class08098 var3, Operation var4) {
      var3.iris$capture();
      var4.call(new Object[]{var1, var2, var3});
   }

   @Override
   public void N(class01421 var1, class07311 var2, class00999 var3) {
      this.N(var1, var2, var3, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 3, "[net.minecraft.class_4587, net.minecraft.class_1921, net.minecraft.class_11659$class_11660]");
         this.y((class01421)var1x[0], (class07311)var1x[1], (class00999)var1x[2]);
         return (Void)null;
      });
   }

   @Override
   public void N(class05436 var1) {
      this.P = true;
      this.z.add(var1);
   }

   @Override
   public void N(class01421 var1, class00500 var2, int var3, int var4, int var5) {
      this.P = true;
      this.R.add(new class01143(var1.L().u(), var2, var3, var4, var5));
      class06202.Nq().D().L().N(var2.i(), class03662.field_4315, var1, this.m, var3, var4, var5);
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
      this.N(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var1x -> {
            WrapOperationRuntime.checkArgumentCount(
               var1x,
               10,
               "[net.minecraft.class_3879, java.lang.Object, net.minecraft.class_4587, net.minecraft.class_1921, int, int, int, net.minecraft.class_1058, int, net.minecraft.class_11683$class_11792]"
            );
            this.y(
               (class06271)var1x[0],
               var1x[1],
               (class01421)var1x[2],
               (class07311)var1x[3],
               (Integer)var1x[4],
               (Integer)var1x[5],
               (Integer)var1x[6],
               (class08388)var1x[7],
               (Integer)var1x[8],
               (class08141)var1x[9]
            );
            return (Void)null;
         }
      );
   }

   @Override
   public void N(class01421 var1, class03662 var2, int var3, int var4, int var5, int[] var6, List<class02022> var7, class07311 var8, class08915 var9) {
      this.P = true;
      List list1 = this.Z;
      class08109 class08109 = new class08109(var1.L().u(), var2, var3, var4, var5, var6, var7, var8, var9);
      List<class08109> list = list1;
      this.N(list, class08109, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.List, java.lang.Object]");
         return ((List)var0[0]).add(var0[1]);
      });
   }

   @Override
   public void N(class01421 var1, class07311 var2, class08887 var3, float var4, float var5, float var6, int var7, int var8, int var9) {
      this.P = true;
      this.B.add(new class06327(var1.L().u(), var2, var3, var4, var5, var6, var7, var8, var9));
   }

   @Override
   public void N(class01421 var1, class07942 var2) {
      this.P = true;
      this.M.add(new class08121(new Matrix4f(var1.L().N()), var2));
   }

   public List<class08130> N() {
      return this.N;
   }

   @Override
   public void N(class01421 var1, @Nullable class06889 var2, int var3, class00392 var4, boolean var5, int var6, double var7, class06959 var9) {
      this.P = true;
      this.L.N(var1, var2, var3, var4, var5, var6, var7, var9);
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
      this.P = true;
      class07928 class07928x = this.E;
      class08098 class08098 = new class08098(var2.L().u(), var1, var4, var5, var6, var7, var8, var9, var10, var11);
      class07928 class07928x = class07928x;
      this.N(
         class07928x,
         var3,
         class08098,
         var0 -> {
            WrapOperationRuntime.checkArgumentCount(
               var0, 3, "[net.minecraft.class_11793$class_12049, net.minecraft.class_1921, net.minecraft.class_11661$class_11789]"
            );
            ((class07928)var0[0]).N((class07311)var0[1], (class08098)var0[2]);
            return (Void)null;
         }
      );
   }

   @Override
   public void N(class01421 var1, float var2, float var3, class01028 var4, boolean var5, class01583 var6, int var7, int var8, int var9, int var10) {
      this.P = true;
      List list1 = this.u;
      class08113 class08113 = new class08113(new Matrix4f(var1.L().N()), var2, var3, var4, var5, var6, var7, var8, var9, var10);
      List<class08113> list = list1;
      this.y(list, class08113, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.List, java.lang.Object]");
         return ((List)var0[0]).add(var0[1]);
      });
   }

   @Override
   public void N(class01421 var1, class08800 var2, Quaternionf var3) {
      this.P = true;
      this.y.add(new class06031(var1.L().u(), var2, var3));
   }

   @Override
   public void N(class01421 var1, class08804 var2) {
      this.P = true;
      this.i.add(new class08146(new Matrix4f(var1.L().N()), var2));
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
      this.P = true;
      this.b.add(new MeshItemCommand(var1.L().u(), var2, var3, var4, var5, var6, var7, var8, var9, var10, var11));
   }

   public void submitBlock(class01421 var1, class00500 var2, int var3, int var4, int var5, class07295 var6, class07209 var7) {
      this.P = true;
      this.s.add(new ExtendedBlockCommand(var1.L().u(), var2, var3, var4, var5, var6, var7));
      class06202.Nq().D().L().N(var2.i(), class03662.field_4315, var1, this.m, var3, var4, var5);
   }

   public class08143 W() {
      return this.W;
   }

   public List<class01143> R() {
      return this.R;
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
      this.P = true;
      this.T.add(new ExtendedBlockStateModelCommand(var1.L().u(), var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12));
   }

   public List fabric_getExtendedBlockCommands() {
      return this.s;
   }

   public List fabric_getExtendedBlockStateModelCommands() {
      return this.T;
   }

   public List sodium_getMeshItemCommands() {
      return this.b;
   }
}
