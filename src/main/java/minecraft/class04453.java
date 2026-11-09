package minecraft;

import Nursultan.class09052;
import Nursultan.class09319;
import Nursultan.class10947;
import Nursultan.class10957;
import Nursultan.class10971;
import Nursultan.class10996;
import Nursultan.class11354;
import Nursultan.class11355;
import Nursultan.class11357;
import Nursultan.class11358;
import Nursultan.class11394;
import Nursultan.class11781;
import Nursultan.class11796;
import Nursultan.class11822;
import Nursultan.class11891;
import Nursultan.class11938;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.PlayerUpdateEvent;
import baritone.api.event.events.SprintStateEvent;
import baritone.api.event.events.type.EventState;
import baritone.behavior.LookBehavior;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalBooleanRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPackets1_21_5;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.Protocol1_21_5To1_21_6;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.Protocol1_21To1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ClientVehicleStorage;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;
import net.irisshaders.iris.mixinterface.BiomeAmbienceInterface;
import net.irisshaders.iris.mixinterface.LocalPlayerInterface;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.Protocolr1_5_2Tor1_6_1;
import net.raphimc.vialegacy.protocol.release.r1_5_2tor1_6_1.packet.ServerboundPackets1_5_2;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04453 extends class04477 implements class11781, class11822, LocalPlayerInterface {
   private static String[] s;
   private static double[] t;
   private static double[] k;
   private static String[] V;
   private static double[] H;
   private static double[] p;
   private static double[] NG;
   private static double[] ND;
   private static double[] yM;
   private static double[] yG;
   private static double[] yK;
   private static double[] yD;
   private static double[] Ly;
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5 = NR();
   public Object y_0;
   public Object y_1;
   public Object y_2;
   public Object y_3;
   public Object y_4;
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public boolean L_init;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object i_6;
   public boolean i_init;
   public Object R_0;
   public Object R_1;
   public Object R_2;
   public Object R_3;
   public Object R_4;
   public Object R_5;
   public Object R_6;
   public Object R_7;
   public boolean R_init;
   public Object M_0;
   public Object M_1;
   public Object M_2;
   public boolean M_init;
   public Object B_0;
   public Object B_1;
   public Object B_2;
   public Object B_3;
   public boolean B_init;
   public static Object Z_0 = LogUtils.getLogger();
   public static Object Z_1;
   public static Object Z_2;
   public static Object Z_3;
   public Object W_0;
   public Object W_1;
   public Object W_2;
   public Object W_3;
   public Object W_4;
   public Object W_5;
   public Object W_6;
   public boolean W_init;
   public Object m_0;
   public Object m_1;
   public boolean m_init;

   public void w() {
      this.method_18380(class01312.field_18076);
      if (this.method_73183() != null) {
         for (double d0 = this.method_23318(); d0 > this.method_73183().method_31607() && d0 <= this.method_73183().method_31600(); d0 += t[3]) {
            this.method_5814(this.method_23317(), d0, this.method_23321());
            if (this.method_73183().N(this)) {
               break;
            }
         }

         this.method_18799(class06889.L);
         this.method_36457(0.0F);
      }

      this.method_6033(this.method_6063());
      super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 = 0;
   }

   private void L(CallbackInfo var1) {
      this.NZ();
      if (ProtocolTranslator.getTargetVersion().equals(ProtocolVersion.v1_21_4) && this.F()) {
         this.method_5728(false);
      }

      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         ((class04474)this.L_1).field_55868 = this.u(((class04474)this.L_1).field_55868);
      }
   }

   private static float L(class07109 var0) {
      float f = Math.abs(var0.z);
      float f1 = Math.abs(var0.U);
      float f2 = f1 > f ? f / f1 : f1 / f;
      return class04995.N(1.0F + class04995.z(f2));
   }

   private void L(class08687 var1) {
      byte b0 = 0;
      b0 = (byte)(b0 | (var1.N() ? 1 : 0));
      b0 = (byte)(b0 | (var1.y() ? 2 : 0));
      b0 = (byte)(b0 | (var1.L() ? 4 : 0));
      b0 = (byte)(b0 | (var1.u() ? 8 : 0));
      b0 = (byte)(b0 | (var1.i() ? 16 : 0));
      b0 = (byte)(b0 | (var1.R() ? 32 : 0));
      b0 = (byte)(b0 | (var1.M() ? 64 : 0));
      PacketWrapper packetwrapper = PacketWrapper.create(ServerboundPackets1_21_5.PLAYER_INPUT, ProtocolTranslator.getPlayNetworkUserConnection());
      packetwrapper.write(Types.BYTE, b0);
      packetwrapper.scheduleSendToServer(Protocol1_21_5To1_21_6.class);
   }

   @Override
   public boolean L() {
      return this.method_24828();
   }

   private boolean L(class04453 var1) {
      this.NZ();
      return ((class11355)this.W_3).R();
   }

   private void L(CallbackInfoReturnable var1) {
      this.NZ();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         boolean flag = this.method_5854() != null && this.method_5854().method_5864() == class07078.t;
         var1.setReturnValue(
            this.method_6128()
               || this.method_74025()
               || this.g()
               || this.method_5765() && !flag
               || this.method_6115() && !this.method_5765() && !this.method_5869()
         );
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_7)) {
         var1.setReturnValue(
            this.method_74025()
               || this.method_5765() && !this.y(this.method_5854())
               || !((class04474)this.L_1).method_20622()
               || !this.p()
               || this.field_5976 && !this.field_34927
               || this.method_5799() && !this.method_5869()
         );
      }
   }

   private float L(float var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_3)) {
         var1 = Float.intBitsToFloat(1597463007 - (Float.floatToIntBits(var1) >> 1));
         return var1 * (1.5F - 0.5F * var1 * var1 * var1);
      } else {
         return class04995.B(var1);
      }
   }

   public void L(boolean var1) {
      this.NZ();
      this.m_1 = var1;
   }

   private float M(class04453 var1) {
      this.NZ();
      return ((class11394)this.W_4).y();
   }

   private boolean M(boolean var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_15_1) && var1;
   }

   @Override
   public double M() {
      return this.method_23318();
   }

   private void M(CallbackInfo var1) {
      IBaritone ibaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(this);
      if (ibaritone != null) {
         ibaritone.getGameEventHandler().onPlayerUpdate(new PlayerUpdateEvent(EventState.PRE));
      }
   }

   public float P() {
      this.NZ();
      return (Float)this.B_2;
   }

   private double P(class04453 var1) {
      this.NZ();
      return ((class11355)this.W_3).B();
   }

   public void K() {
      this.NZ();
      ((class01683)this.y_0).N(new class00535(class00569.field_12774));
      class06428.u();
   }

   public void T() {
      this.NZ();
      ((class01683)this.y_0).N(new class07375(this, class07363.field_12988));
   }

   private boolean T(class04453 var1) {
      return !ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)
         ? this.F()
         : this.Nu() || this.field_5976 && !this.field_34927 || !this.H();
   }

   public boolean Q() {
      this.NZ();
      return (Boolean)this.m_1;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      this.NZ();
      super.method_5674(var1);
      if (class07438.staticFields_6212a028292fd3c078969e3ee4c71d9e8_0.equals(var1)) {
         boolean flag = (this.field_6011.<Byte>N(class07438.staticFields_6212a028292fd3c078969e3ee4c71d9e8_0) & 1) > 0;
         class07050 class07050 = (this.field_6011.<Byte>N(class07438.staticFields_6212a028292fd3c078969e3ee4c71d9e8_0) & 2) > 0
            ? class07050.field_5810
            : class07050.field_5808;
         if (flag && !(Boolean)this.i_1) {
            this.method_6019(class07050);
         } else if (!flag && (Boolean)this.i_1) {
            this.method_6021();
         }
      }

      if (field_5990.equals(var1) && this.method_6128() && !(Boolean)this.i_6) {
         ((class06202)this.L_3).Nr().N((class00044)(new class00141(this)));
      }
   }

   @Override
   public class06889 method_30951(float var1) {
      this.NZ();
      if (((class05630)((class06202)this.L_3).i_7).NS().N()) {
         float f = class04995.B(var1 * 0.5F, this.method_36454(), this.field_5982) * (float) (Math.PI / 180.0);
         float f1 = class04995.B(var1 * 0.5F, this.method_36455(), this.field_6004) * (float) (Math.PI / 180.0);
         double d0 = this.method_6068() == class07070.field_6183 ? ND[5] : k[0];
         return new class06889(k[1] * d0, k[2], k[3]).N(-f1).y(-f).i(this.method_5836(var1));
      } else {
         return super.method_30951(var1);
      }
   }

   @Override
   public float method_73188() {
      return this.method_36454();
   }

   @Override
   public void method_5773() {
      this.NZ();
      if (((class01683)this.y_0).I()) {
         class08722 class08722 = (class08722)this.y_3;
         this.Z(null);
         class08722.y();
         super.method_5773();
         this.M(null);
         this.B(null);
         if (!((class08687)this.L_2).equals(((class04474)this.L_1).field_54155)) {
            class01683 class01683x = (class01683)this.y_0;
            class07352 class07352 = new class07352(((class04474)this.L_1).field_54155);
            class01683 class01683x = class01683x;
            this.y(class01683x, class07352);
            this.L_2 = ((class04474)this.L_1).field_54155;
         }

         if (this.method_5765()) {
            class01683 class01683 = (class01683)this.y_0;
            class00530 class00530 = new class00530(this.method_36454(), this.method_36455(), this.method_24828(), this.field_5976);
            class01683 class01683x = class01683;
            this.N(class01683x, class00530);
            class07049 class07049 = this.method_5668();
            if (class07049 != this && class07049.method_66247()) {
               ((class01683)this.y_0).N(class00557.N(class07049));
               if (this.z(this)) {
                  this.A();
               }
            }
         } else {
            this.r();
         }

         Iterator iterator = ((List)this.y_4).iterator();

         while (iterator.hasNext()) {
            ((class00169)iterator.next()).N();
         }

         this.N(null);
      }
   }

   @Override
   public void method_5784(class07451 var1, class06889 var2) {
      double d0 = this.method_23317();
      double d1 = this.method_23321();
      super.method_5784(var1, var2);
      float f = (float)(this.method_23317() - d0);
      float f1 = (float)(this.method_23321() - d1);
      this.N(f, f1);
      this.N(class04995.M(f, f1) * 0.6F);
   }

   @Override
   public boolean method_39759(class06889 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable(V[0], true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         float f = this.method_36454() * (float) (Math.PI / 180.0);
         double d0 = class04995.m(f);
         double d1 = class04995.P(f);
         double d2 = super.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * d1 - super.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() * d0;
         double d3 = super.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() * d1 + super.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * d0;
         double d4 = class04995.E(d2) + class04995.E(d3);
         double d5 = class04995.E(var1.M) + class04995.E(var1.Z);
         return !(d4 < ND[0]) && !(d5 < ND[1]) ? Math.acos((d2 * var1.M + d3 * var1.Z) / Math.sqrt(d4 * d5)) < ND[2] : false;
      }
   }

   @Override
   public boolean method_18276() {
      this.NZ();
      return (Boolean)this.R_5;
   }

   @Override
   public boolean method_5869() {
      return super.fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
   }

   @Override
   public void method_5783(class04891 var1, float var2, float var3) {
      this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), var1, this.method_5634(), var2, var3, false);
   }

   @Override
   public boolean method_27298() {
      return !this.method_31549().y && super.method_27298();
   }

   @Override
   public float method_5705(float var1) {
      return this.method_5765() ? super.method_5705(var1) : this.method_36454();
   }

   @Override
   public float method_5695(float var1) {
      return this.method_36455();
   }

   @Override
   public boolean method_5715() {
      this.NZ();
      return ((class04474)this.L_1).field_54155.R();
   }

   @Override
   public void method_29239() {
      this.NZ();
      super.method_29239();
      this.i_3 = false;
   }

   @Override
   public boolean method_5873(class07049 var1, boolean var2, boolean var3) {
      this.NZ();
      if (!super.method_5873(var1, var2, var3)) {
         boolean flag = false;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable(s[0], false, flag);
         this.N(var1, var2, var3, callbackinforeturnable);
         return false;
      } else {
         if (var1 instanceof class07504 class07504) {
            ((class06202)this.L_3).Nr().N((class00044)(new class00043(this, class07504, true, class04909.Tr, 0.0F, 0.75F, 1.0F)));
            ((class06202)this.L_3).Nr().N((class00044)(new class00043(this, class07504, false, class04909.bN, 0.0F, 0.75F, 1.0F)));
         } else if (var1 instanceof class00032 class00032) {
            ((class06202)this.L_3).Nr().N((class00044)(new class08678(this, class00032, false, class04909.mY, class00032.method_5634(), 0.0F, 1.0F, 5.0F)));
         } else if (var1 instanceof class08156 class08156) {
            ((class06202)this.L_3).Nr().N((class00044)(new class08678(this, class08156, true, class04909.yE, class08156.method_5634(), 0.0F, 1.0F, 5.0F)));
         }

         boolean flag1 = true;
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable(s[1], false, flag1);
         this.N(var1, var2, var3, callbackinforeturnable1);
         return true;
      }
   }

   @Override
   public void method_5842() {
      this.NZ();
      this.U(null);
      super.method_5842();
      this.i_3 = false;
      class07049 class07049 = this.method_49694();
      if (class07049 instanceof class00250) {
         ((class00250)class07049)
            .N(
               ((class04474)this.L_1).field_54155.L(),
               ((class04474)this.L_1).field_54155.u(),
               ((class04474)this.L_1).field_54155.N(),
               ((class04474)this.L_1).field_54155.y()
            );
         this.i_3 = (Boolean)this.i_3
            | (
               ((class04474)this.L_1).field_54155.L()
                  || ((class04474)this.L_1).field_54155.u()
                  || ((class04474)this.L_1).field_54155.N()
                  || ((class04474)this.L_1).field_54155.y()
            );
      }
   }

   @Override
   public void method_5711(byte var1) {
      switch (var1) {
         case 24:
            this.N(class08152.M);
            break;
         case 25:
            this.N(class06984.y);
            break;
         case 26:
            this.N(class06984.L);
            break;
         case 27:
            this.N(class06984.u);
            break;
         case 28:
            this.N(class06984.i);
            break;
         default:
            super.method_5711(var1);
      }
   }

   public class04453(class06202 var1, class03448 var2, class01683 var3, class01205 var4, class01756 var5, class08687 var6, boolean var7) {
      super(var2, var3.E());
      this.NZ();
      this.W_1 = new class06889(yM[0], yM[1], yM[2]);
      this.W_5 = new class11796();
      this.y_3 = new class08722(20, 1280);
      this.y_4 = Lists.newArrayList();
      this.M_0 = class08152.M;
      this.L_1 = new class04474();
      this.L_5 = Integer.MIN_VALUE;
      this.i_4 = true;
      this.m_1 = true;
      this.W_0 = false;
      this.L_3 = var1;
      this.y_0 = var3;
      this.y_1 = var4;
      this.y_2 = var5;
      this.L_2 = var6;
      this.R_6 = var7;
      ((List)this.y_4).add(new class00020(this, var1.Nr()));
      ((List)this.y_4).add(new class05684(this));
      ((List)this.y_4).add(new class05397(this, var1.Nr()));
      this.N(var1, var2, var3, var4, var5, var6, var7, null);
   }

   static {
      NN();
      S();
      C();
   }

   private void B(boolean var1) {
      this.NZ();
      this.i_0 = (Float)this.B_3;
      float f = 0.0F;
      if (var1 && this.field_51994 != null && this.field_51994.i()) {
         if ((class05096)((class06202)this.L_3).v_3 != null && !((class05096)((class06202)this.L_3).v_3).method_73217()) {
            if ((class05096)((class06202)this.L_3).v_3 instanceof class01463) {
               this.method_7346();
            }

            ((class06202)this.L_3).N(null);
         }

         if ((Float)this.B_3 == 0.0F) {
            ((class06202)this.L_3).Nr().N(class00040.y(class04909.lt, this.field_5974.z() * 0.4F + 0.8F, 0.25F));
         }

         f = 0.0125F;
         this.field_51994.N(false);
      } else if ((Float)this.B_3 > 0.0F) {
         f = -0.05F;
      }

      this.B_3 = class04995.N((Float)this.B_3 + f, 0.0F, 1.0F);
   }

   private boolean B(class04453 var1) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_5);
   }

   private int B(int var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) ? var1 - 1 : var1;
   }

   private void B(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_21_2, ProtocolVersion.v1_21_5)) {
         this.a();
      }
   }

   private static void C() {
      Z_1 = 20;
      Z_2 = 600;
      Z_3 = 100;
      N_0 = 0.6F;
      N_1 = NG[2];
      N_2 = NG[3];
      N_3 = Integer.MIN_VALUE;
      N_4 = -2147483647;
   }

   private boolean F() {
      this.NZ();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable(s[5], true);
      this.L(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         boolean flag = this.method_31549().y;
         return !this.N(this, flag) || !((class04474)this.L_1).method_20622() || this.field_5976 && !this.field_34927;
      }
   }

   public boolean I() {
      this.NZ();
      return (Boolean)this.W_0;
   }

   public boolean J() {
      this.NZ();
      return ((class06202)this.L_3).F() == this;
   }

   private static void S() {
      s = new String[7];
      s[0] = "";
      s[1] = "";
      s[2] = "";
      s[3] = "";
      s[4] = "";
      s[5] = "";
      s[6] = "";
      V = new String[5];
      V[0] = "";
      V[1] = "";
      V[2] = "";
      V[3] = "mayFly";
      V[4] = "[net.minecraft.class_744]";
   }

   private float Z(class04453 var1) {
      class11354 class11354 = class11354.y(var1.Y());
      class11938.L().L(class11354);
      return class11354.N();
   }

   private void Z(CallbackInfo var1) {
      class11938.L().L(class10996.N());
   }

   private boolean e() {
      this.NZ();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable(V[2], true);
      this.y(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         if (!this.method_5624() && ((class04474)this.L_1).method_20622()) {
            boolean flag = this.method_31549().y;
            if (this.N(this, flag) && !this.x() && (!this.method_6128() || this.method_5869()) && (!this.t(this) || this.method_5869())) {
               return true;
            }
         }

         return false;
      }
   }

   private void i(CallbackInfo var1) {
      this.NZ();
      this.W_3 = class11355.N(
         this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), this.method_36455(), this.method_24828(), this.method_5624()
      );
      class11938.L().L((class11355)this.W_3);
      class11891.N(this);
      if (((class11355)this.W_3).y()) {
         var1.cancel();
      }
   }

   public boolean i(boolean var1) {
      this.NZ();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable(s[3], true);
      this.y(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         class07356 class07356 = var1 ? class07356.field_12970 : class07356.field_12975;
         class06584 class06584 = this.method_31548().N(var1);
         ((class01683)this.y_0).N(new class07364(class07356, class07209.field_10980, class07211.field_11033));
         return !class06584.R();
      }
   }

   private boolean i(class04453 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_1) && var1.method_5681();
   }

   @Override
   public class07438 i() {
      return this;
   }

   private boolean b(class04453 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20) && var1.method_5765();
   }

   public class02244 b() {
      return this.field_51994 == null ? class02244.field_52062 : this.field_51994.N();
   }

   private boolean x() {
      return this.method_6115() && !super.fields_9212a028292fd3c078969e3ee4c71d9e8_0.a_(class02484.M, class08153.N).N();
   }

   public class08722 s() {
      this.NZ();
      return (class08722)this.y_3;
   }

   private boolean s(class04453 var1) {
      this.NZ();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
         return ((class04474)var1.L_1).field_54155.R();
      } else {
         return !ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)
            ? var1.g()
            : !((class04453)class06202.Nq().T_4).method_7325() && (((class04474)var1.L_1).field_54155.R() || var1.g());
      }
   }

   public boolean n() {
      this.NZ();
      return (Boolean)this.i_3;
   }

   private double n(class04453 var1) {
      this.NZ();
      return ((class11355)this.W_3).i();
   }

   private void f() {
      this.NZ();
      if ((Integer)this.L_5 == Integer.MIN_VALUE) {
         this.L_5 = -2147483647;
      } else {
         this.L_5 = this.field_6012;
      }
   }

   public class08687 l() {
      this.NZ();
      return (class08687)this.L_2;
   }

   public boolean d() {
      this.NZ();
      return (Boolean)this.i_4;
   }

   private void a() {
      this.NZ();
      boolean flag = this.method_5715();
      if (flag != (Boolean)this.W_6) {
         PacketWrapper packetwrapper = PacketWrapper.create(ServerboundPackets1_21_5.PLAYER_COMMAND, ProtocolTranslator.getPlayNetworkUserConnection());
         packetwrapper.write(Types.VAR_INT, this.method_5628());
         packetwrapper.write(Types.VAR_INT, flag ? 0 : 1);
         packetwrapper.write(Types.VAR_INT, 0);
         packetwrapper.scheduleSendToServer(Protocol1_21_5To1_21_6.class);
         this.W_6 = flag;
      }
   }

   public float m() {
      this.NZ();

      for (class00169 class00169 : (List)this.y_4) {
         if (class00169 instanceof class05397) {
            return ((class05397)class00169).y();
         }
      }

      return 0.0F;
   }

   private boolean m(class04453 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_12_2) && var1.method_5799();
   }

   public class11796 dataManager() {
      this.NZ();
      return (class11796)this.W_5;
   }

   private boolean p() {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_19_1) && this.method_5765() || this.method_76458();
   }

   public boolean k() {
      this.NZ();
      return ((class04474)this.L_1).method_3128().L() > 0.0F;
   }

   public void t() {
      this.NZ();
      super.method_7346();
      ((class06202)this.L_3).N(null);
   }

   private boolean t(class04453 var1) {
      class10971 class10971 = class10971.L();
      class11938.L().L(class10971);
      return class10971.y() ? false : var1.g();
   }

   public boolean g() {
      return this.method_18276() || this.method_20448();
   }

   private float v(class04453 var1) {
      this.NZ();
      return ((class11355)this.W_3).Z();
   }

   public void v() {
      this.NZ();
      ((class01683)this.y_0).N(new class07375(this, class07363.field_12987, class04995.y(this.P() * 100.0F)));
   }

   private float j(class04453 var1) {
      this.NZ();
      return ((class11355)this.W_3).M();
   }

   public float j() {
      this.NZ();
      if (!this.method_5777(class01231.N)) {
         return 0.0F;
      } else {
         float f = 600.0F;
         float f1 = 100.0F;
         if (((Integer)this.m_0).intValue() >= 600.0F) {
            return 1.0F;
         } else {
            float f2 = class04995.N(((Integer)this.m_0).intValue() / 100.0F, 0.0F, 1.0F);
            float f3 = ((Integer)this.m_0).intValue() < 100.0F ? 0.0F : class04995.N((((Integer)this.m_0).intValue() - 100.0F) / 500.0F, 0.0F, 1.0F);
            return f2 * 0.6F + f3 * 0.39999998F;
         }
      }
   }

   public class01756 q() {
      this.NZ();
      return (class01756)this.y_2;
   }

   private boolean U(class04453 var1) {
      this.NZ();
      return !ProtocolTranslator.getTargetVersion().betweenInclusive(LegacyProtocolVersion.r1_4_2, ProtocolVersion.v1_8)
            && !ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5)
         ? (Boolean)this.R_3
         : !this.method_24828();
   }

   private void U(CallbackInfo var1) {
      IBaritone ibaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(this);
      if (ibaritone != null) {
         ((LookBehavior)ibaritone.getLookBehavior()).pig();
      }
   }

   private boolean z(class04453 var1) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19_3);
   }

   private void z(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
         this.a();
      }
   }

   private class07109 u(class07109 var1) {
      if (var1.L() == 0.0F) {
         return var1;
      } else {
         float f1 = 0.98F;
         class07109 class07109 = this.N(var1, f1);
         if (this.method_6115() && !this.method_5765()) {
            class07109 = class07109.N(this.Z(this));
         }

         if (this.s(this)) {
            float f = (float)this.method_45325(class05298.Y);
            class07109 = class07109.N(f);
         }

         return this.y(class07109);
      }
   }

   public void u(boolean var1) {
      this.NZ();
      this.W_0 = var1;
   }

   @Override
   public double u() {
      this.NZ();
      return (Double)this.M_2;
   }

   private boolean u(class04453 var1) throws Throwable {
      IBaritone ibaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(this);
      return ibaritone == null
         ? (boolean)((MethodHandle)N_5).invokeExact((class04453)var1)
         : !ibaritone.getPathingBehavior().isPathing() && (boolean)((MethodHandle)N_5).invokeExact((class04453)var1);
   }

   private void u(CallbackInfo var1) {
      this.NZ();
      this.W_4 = class11394.N(((class04453)((class06202)this.L_3).T_4).method_36454(), ((class04453)((class06202)this.L_3).T_4).method_36455());
      class11938.L().L((class11394)this.W_4);
   }

   private void r() {
      this.NZ();
      CallbackInfo callbackinfo = new CallbackInfo(s[2], true);
      this.i(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.A();
         this.z(null);
         if (this.J()) {
            double d0 = this.P(this) - (Double)this.M_1;
            double d1 = this.n(this) - (Double)this.M_2;
            double d2 = this.y(this) - (Double)this.R_0;
            double d3 = this.j(this) - (Float)this.R_1;
            double d4 = this.v(this) - (Float)this.R_2;
            this.R_7 = (Integer)this.R_7 + 1;
            double d6 = class04995.R(d0, d1, d2);
            double d5 = yM[3];
            boolean flag = d6 > this.N(d5) || this.B((Integer)this.R_7) >= 20;
            boolean flag1 = d3 != yM[4] || d4 != yM[5];
            if (flag && flag1) {
               ((class01683)this.y_0).N(new class00564(this.method_73189(), this.j(this), this.v(this), this.L(this), this.field_5976));
            } else if (flag) {
               ((class01683)this.y_0).N(new class00550(this.method_73189(), this.L(this), this.field_5976));
            } else if (flag1) {
               ((class01683)this.y_0).N(new class00530(this.j(this), this.v(this), this.L(this), this.field_5976));
            } else if (this.U(this) != this.L(this) || (Boolean)this.R_4 != this.field_5976) {
               ((class01683)this.y_0).N(new class00525(this.L(this), this.field_5976));
            }

            if (flag) {
               this.M_1 = this.P(this);
               this.M_2 = this.n(this);
               this.R_0 = this.y(this);
               this.R_7 = 0;
            }

            if (flag1) {
               this.R_1 = this.j(this);
               this.R_2 = this.v(this);
            }

            this.R_3 = this.L(this);
            this.R_4 = this.field_5976;
            this.i_4 = ((class05630)((class06202)this.L_3).i_7).f().method_41753();
         }
      }
   }

   public void y(float var1) {
      this.NZ();
      if ((Boolean)this.L_0) {
         float f = this.method_6032() - var1;
         if (f <= 0.0F) {
            this.method_6033(var1);
            if (f < 0.0F) {
               this.field_6008 = 10;
            }
         } else {
            super.fields_6212a028292fd3c078969e3ee4c71d9e8_3 = f;
            this.field_6008 = 20;
            this.method_6033(var1);
            super.fields_2212a028292fd3c078969e3ee4c71d9e8_1 = 10;
            super.fields_2212a028292fd3c078969e3ee4c71d9e8_0 = super.fields_2212a028292fd3c078969e3ee4c71d9e8_1;
         }
      } else {
         this.method_6033(var1);
         this.L_0 = true;
      }
   }

   @Override
   public boolean y() {
      this.NZ();
      return (Boolean)this.R_3;
   }

   private double y(class04453 var1) {
      this.NZ();
      return ((class11355)this.W_3).u();
   }

   private boolean y(class07049 var1) {
      return var1.method_48155() && var1.method_66247();
   }

   private class07109 y(class07109 var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4) ? var1 : N(var1);
   }

   private void y(class01683 var1, class00381 var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5) && var2 instanceof class07352 class07352x) {
         class07352 class07352x = class07352x;

         try {
            class08687 = class07352x.N();
         } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
         }

         class08687 class08687x = class08687;
         this.L(class08687x);
      } else {
         var1.N(var2);
      }
   }

   private void y(CallbackInfoReturnable var1) {
      this.NZ();
      ProtocolVersion protocolversion = ProtocolTranslator.getTargetVersion();
      if (protocolversion.olderThanOrEqualTo(ProtocolVersion.v1_21_7)) {
         var1.setReturnValue(
            !this.method_5624()
               && (protocolversion.olderThanOrEqualTo(ProtocolVersion.v1_21_4) ? this.NM() : ((class04474)this.L_1).method_20622())
               && this.p()
               && !this.method_6115()
               && !this.method_74025()
               && (!protocolversion.newerThan(ProtocolVersion.v1_19_3) || !this.method_5765() || this.y(this.method_5854()))
               && (!protocolversion.newerThan(ProtocolVersion.v1_19_3) || !this.method_6128() || this.method_5869())
               && (!this.g() || !protocolversion.equals(ProtocolVersion.v1_21_4) || this.method_5869() && protocolversion.equals(ProtocolVersion.v1_21_4))
               && (
                  !protocolversion.olderThanOrEqualTo(ProtocolVersion.v1_21_4) && (!this.method_5799() || this.method_5869())
                     || protocolversion.olderThanOrEqualTo(ProtocolVersion.v1_21_4)
               )
         );
      }
   }

   private boolean y(class08687 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_4) && var1.y();
   }

   private void y(boolean var1, CallbackInfoReturnable var2) {
      class11358 class11358 = class11358.N(this.method_31548().N());
      class11938.L().L(class11358);
      if (class11358.y()) {
         var2.setReturnValue(false);
      }
   }

   private void y(CallbackInfo var1) {
      this.NZ();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
         this.R_5 = this.method_5715() && !this.method_6113();
      }
   }

   private boolean E(class04453 var1) {
      this.NZ();
      return (class11355)this.W_3 == null ? var1.method_5624() : ((class11355)this.W_3).L();
   }

   private void A() {
      this.NZ();
      boolean flag = this.E(this);
      if (flag != (Boolean)this.R_6) {
         class07363 class07363 = flag ? class07363.field_12981 : class07363.field_12985;
         ((class01683)this.y_0).N(new class07375(this, class07363));
         this.R_6 = flag;
      }
   }

   private boolean N(class04474 var1, Operation var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4) ? this.Ny() : (Boolean)var2.call(new Object[]{var1});
   }

   public void N(class07282 var1) {
      if (var1 == class07282.field_9219) {
         this.method_18799(this.method_18798().N(class07185.field_11052, ND[4]));
      }
   }

   private void N_45(CallbackInfo var1, LocalBooleanRef var2) {
      this.NZ();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         var2.set(!((class04474)this.L_1).field_54155.R() && !this.NM());
      }
   }

   private boolean N(class07209 var1) {
      class00734 class00734x = this.method_5829();
      class00734 class00734x = new class00734(
            var1.method_10263(), class00734x.y, var1.method_10260(), var1.method_10263() + t[0], class00734x.i, var1.method_10260() + t[1]
         )
         .B(t[2]);
      return this.method_73183().method_39454(this, class00734x);
   }

   public void N(class00329 var1) {
      this.NZ();
      if (((class01756)this.y_2).y(var1)) {
         ((class01756)this.y_2).L(var1);
         ((class01683)this.y_0).N(new class07337(var1));
      }
   }

   public void N(float var1, float var2) {
      this.NZ();
      if (this.NB()) {
         class06889 class06889xxxxxx = this.method_73189();
         class06889 class06889x = class06889xxxxxx.y(var1, yK[7], var2);
         class06889 class06889xx = new class06889(var1, H[0], var2);
         float f = this.method_6029();
         float f1 = (float)class06889xx.B();
         if (f1 <= 0.001F) {
            class07109 class07109 = ((class04474)this.L_1).method_3128();
            float f2 = f * class07109.z;
            float f3 = f * class07109.U;
            float f4 = class04995.m(this.method_36454() * (float) (Math.PI / 180.0));
            float f5 = class04995.P(this.method_36454() * (float) (Math.PI / 180.0));
            class06889xx = new class06889(f2 * f5 - f3 * f4, class06889xx.B, f3 * f5 + f2 * f4);
            f1 = (float)class06889xx.B();
            if (f1 <= 0.001F) {
               return;
            }
         }

         float f12 = this.L(f1);
         class06889 class06889xxx = class06889xx.L((double)f12);
         class06889 class06889xxxx = this.method_5663();
         float f13 = (float)(class06889xxxx.M * class06889xxx.M + class06889xxxx.Z * class06889xxx.Z);
         if (!(f13 < -0.15F)) {
            class06092 class06092 = class06092.N((class07049)this);
            class07209 class07209 = class07209.method_49637(this.method_23317(), this.method_5829().i, this.method_23321());
            if (this.method_73183().method_8320(class07209).y(this.method_73183(), class07209, class06092).method_1110()) {
               class07209 = class07209.method_10084();
               if (this.method_73183().method_8320(class07209).y(this.method_73183(), class07209, class06092).method_1110()) {
                  float f6 = 7.0F;
                  float f7 = 1.2F;
                  if (this.method_6059(class07047.B)) {
                     f7 += (this.method_6112(class07047.B).i() + 1) * 0.75F;
                  }

                  float f8 = Math.max(f * 7.0F, 1.0F / f12);
                  class06889 class06889xxxxx = class06889x.i(class06889xxx.L((double)f8));
                  float f9 = this.method_17681();
                  float f10 = this.method_17682();
                  class00734 class00734 = new class00734(class06889xxxxxx, class06889xxxxx.y(H[1], f10, yD[0])).L(f9, yD[1], f9);
                  class06889 class06889xxxxxx = class06889xxxxxx.y(yD[2], yD[3], yD[4]);
                  class06889xxxxx = class06889xxxxx.y(p[0], p[1], p[2]);
                  class06889 class06889xxxxxxx = class06889xxx.L(new class06889(p[3], p[4], p[5])).L((double)(f9 * 0.5F));
                  class06889 class06889xxxxxxxx = class06889xxxxxx.u(class06889xxxxxxx);
                  class06889 class06889xxxxxxxxx = class06889xxxxx.u(class06889xxxxxxx);
                  class06889 class06889xxxxxxxxxx = class06889xxxxxx.i(class06889xxxxxxx);
                  class06889 class06889xxxxxxxxxxx = class06889xxxxx.i(class06889xxxxxxx);
                  Iterator iterator = StreamSupport.stream(this.method_73183().method_8600(this, class00734).spliterator(), false)
                     .flatMap(var0 -> var0.method_1090().stream())
                     .iterator();
                  float f11 = Float.MIN_VALUE;

                  while (iterator.hasNext()) {
                     class00734 class00734x = (class00734)iterator.next();
                     if (class00734x.N(class06889xxxxxxxx, class06889xxxxxxxxx) || class00734x.N(class06889xxxxxxxxxx, class06889xxxxxxxxxxx)) {
                        f11 = (float)class00734x.i;
                        class07209 class07209x = class07209.method_49638(class00734x.R());

                        for (int i = 1; i < f7; i++) {
                           class07209 class07209xx = class07209x.method_10086(i);
                           class00494 class00494;
                           if (!(class00494 = this.method_73183().method_8320(class07209xx).y(this.method_73183(), class07209xx, class06092)).method_1110()) {
                              f11 = (float)class00494.method_1105(class07185.field_11052) + class07209xx.method_10264();
                              if (f11 - this.method_23318() > f7) {
                                 return;
                              }
                           }

                           if (i > 1) {
                              class07209 = class07209.method_10084();
                              if (!this.method_73183().method_8320(class07209).y(this.method_73183(), class07209, class06092).method_1110()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if (f11 != Float.MIN_VALUE) {
                     float f14 = (float)(f11 - this.method_23318());
                     if (!(f14 <= 0.5F) && !(f14 > f7)) {
                        this.i_5 = 1;
                     }
                  }
               }
            }
         }
      }
   }

   private void N(CallbackInfo var1) {
      class11938.L().L(class10957.N());
   }

   private void N(class06889 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17_1)) {
         var2.setReturnValue(false);
      }
   }

   private void N(double var1, double var3, CallbackInfo var5) {
      class09319 class09319 = class09319.L();
      class11938.L().L(class09319);
      if (class09319.y()) {
         var5.cancel();
      }
   }

   private boolean N(class04453 var1) {
      IBaritone ibaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(var1);
      return ibaritone != null && ibaritone.getPathingBehavior().isPathing() ? false : var1.method_23668();
   }

   private static class07089 N(class07049 var0, double var1, double var3, float var5) {
      double d0 = Math.max(var1, var3);
      double d1 = class04995.E(d0);
      class06889 class06889xx = var0.method_5836(var5);
      class07089 class07089 = var0.method_5745(d0, var5, false);
      double d2 = class07089.y().M(class06889xx);
      if (class07089.N() != class07113.field_1333) {
         d1 = d2;
         d0 = Math.sqrt(d2);
      }

      class06889 class06889x = var0.method_5828(var5);
      class06889 class06889xx = class06889xx.y(class06889x.M * d0, class06889x.B * d0, class06889x.Z * d0);
      float f = 1.0F;
      class00734 class00734 = var0.method_5829().y(class06889x.L(d0)).L(k[4], k[5], k[6]);
      class06145 class06145 = class08038.N(var0, class06889xx, class06889xx, class00734, NL(), d1);
      return class06145 != null && class06145.y().M(class06889xx) < d2 ? N(class06145, class06889xx, var3) : N(class07089, class06889xx, var1);
   }

   private boolean N(class04453 var1, LocalBooleanRef var2) {
      this.NZ();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         boolean flag = this.e();
         if (((this.method_5765() ? this.method_5854().method_24828() : this.method_24828()) || this.method_5869()) && var2.get() && flag) {
            if ((Integer)this.L_4 <= 0 && !((class05630)((class06202)this.L_3).i_7).k.R()) {
               this.L_4 = ((class05630)((class06202)this.L_3).i_7).Nn().method_41753();
            } else {
               this.method_5728(true);
            }
         }

         if (this.H() && flag && ((class05630)((class06202)this.L_3).i_7).k.R()) {
            this.method_5728(true);
         }

         return false;
      } else {
         return this.e();
      }
   }

   private void N(class01683 var1, class00381 var2) {
      this.NZ();
      if (ProtocolTranslator.getTargetVersion().newerThan(LegacyProtocolVersion.r1_5_2)) {
         var1.N(var2);
      } else {
         UserConnection userconnection = ((class01683)this.y_0).M().viaFabricPlus$getUserConnection();
         userconnection.getChannel().eventLoop().execute(() -> {
            PacketWrapper packetwrapper = PacketWrapper.create(ServerboundPackets1_5_2.MOVE_PLAYER_POS_ROT, userconnection);
            packetwrapper.write(Types.DOUBLE, this.method_18798().M);
            packetwrapper.write(Types.DOUBLE, yG[4]);
            packetwrapper.write(Types.DOUBLE, yG[5]);
            packetwrapper.write(Types.DOUBLE, this.method_18798().Z);
            packetwrapper.write(Types.FLOAT, this.method_36454());
            packetwrapper.write(Types.FLOAT, this.method_36455());
            packetwrapper.write(Types.BOOLEAN, this.method_24828());
            packetwrapper.sendToServer(Protocolr1_5_2Tor1_6_1.class);
            ClientVehicleStorage clientvehiclestorage = (ClientVehicleStorage)userconnection.get(ClientVehicleStorage.class);
            if (clientvehiclestorage != null) {
               PacketWrapper packetwrapper1 = PacketWrapper.create(ServerboundPackets1_20_5.PLAYER_INPUT, userconnection);
               packetwrapper1.write(Types.FLOAT, clientvehiclestorage.sidewaysMovement());
               packetwrapper1.write(Types.FLOAT, clientvehiclestorage.forwardMovement());
               packetwrapper1.write(Types.BYTE, clientvehiclestorage.flags());
               packetwrapper1.sendToServer(Protocol1_21To1_21_2.class);
            }
         });
      }
   }

   private void N(CallbackInfoReturnable var1) {
      this.NZ();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         var1.setReturnValue(!this.method_24828() && !((class04474)this.L_1).field_54155.R() && this.Nu() || !this.method_5799());
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_7)) {
         var1.setReturnValue(
            this.method_74025()
               || this.method_5765() && !this.y(this.method_5854())
               || !this.method_5799()
               || !((class04474)this.L_1).method_20622() && !this.method_24828() && !((class04474)this.L_1).field_54155.R()
               || !this.p()
         );
      }
   }

   @Override
   public class06889 N() {
      this.NZ();
      return (class06889)this.W_1;
   }

   private boolean N(class08033 var1) {
      IBaritone ibaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(this);
      return ibaritone == null ? var1.L : !ibaritone.getPathingBehavior().isPathing() && var1.L;
   }

   private void N(boolean var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_9)) {
         var2.setReturnValue(!this.method_74025() && this.p() && (!this.method_5765() || this.y(this.method_5854())) && (var1 || !this.method_74016()));
      }
   }

   private boolean N(class04453 var1, boolean var2) {
      return this.R(var2 || ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) && (var1.method_5681() || var1.method_24828()));
   }

   private class07109 N(class07109 var1, float var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4) ? var1 : var1.N(var2);
   }

   private boolean N(class08687 var1) {
      IBaritone ibaritone = BaritoneAPI.getProvider().getBaritoneForPlayer(this);
      if (ibaritone == null) {
         return var1.M();
      } else {
         SprintStateEvent sprintstateevent = new SprintStateEvent();
         ibaritone.getGameEventHandler().onPlayerSprintState(sprintstateevent);
         if (sprintstateevent.getState() != null) {
            return sprintstateevent.getState();
         } else {
            return ibaritone != BaritoneAPI.getProvider().getPrimaryBaritone() ? false : var1.M();
         }
      }
   }

   private class07109 N(class04453 var1, class07109 var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4) ? var2 : this.u(var2);
   }

   private double N(double var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18) ? k[7] : class04995.E(var1);
   }

   private static class07089 N(class07089 var0, class06889 var1, double var2) {
      if (!var0.y().N((class00737)var1, var2)) {
         class06889 class06889 = var0.y();
         class07211 class07211 = class07211.N(class06889.M - var1.M, class06889.B - var1.B, class06889.Z - var1.Z);
         return class06183.N(class06889, class07211, class07209.method_49638(class06889));
      } else {
         return var0;
      }
   }

   public class07089 N(float var1, class07049 var2) {
      class06543 class06543 = this.method_76694().method_58694(class02484.I);
      double d0 = this.method_55754();
      class07089 class07089 = null;
      if (class06543 != null) {
         class07089 = class06543.N(var2, var1, class07042.B);
         if (class07089 instanceof class06183) {
            class07089 = N(class07089, var2.method_5836(var1), d0);
         }
      }

      if (class07089 == null || class07089.N() == class07113.field_1333) {
         double d1 = this.method_55755();
         class07089 = N(var2, d0, d1, var1);
      }

      return class07089;
   }

   @Override
   public void N(boolean var1) {
      this.NZ();
      this.W_2 = var1;
   }

   private static class07109 N(class07109 var0) {
      float f = var0.y();
      if (f <= 0.0F) {
         return var0;
      } else {
         class07109 class07109 = var0.N(1.0F / f);
         float f1 = L(class07109);
         float f2 = Math.min(f * f1, 1.0F);
         return class07109.N(f2);
      }
   }

   private void N(double var1, double var3) {
      CallbackInfo callbackinfo = new CallbackInfo(s[4], true);
      this.N(var1, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class07209 class07209 = class07209.method_49637(var1, this.method_23318(), var3);
         if (this.N(class07209)) {
            double d0 = var1 - class07209.method_10263();
            double d1 = var3 - class07209.method_10260();
            class07211 class07211x = null;
            double d2 = yM[6];

            for (class07211 class07211x : new class07211[]{class07211.field_11039, class07211.field_11034, class07211.field_11043, class07211.field_11035}) {
               double d3 = class07211x.z().N(d0, Ly[0], d1);
               double d4 = class07211x.i() == class07212.field_11056 ? Ly[1] - d3 : d3;
               if (d4 < d2 && !this.N(class07209.method_10093(class07211x))) {
                  d2 = d4;
                  class07211x = class07211x;
               }
            }

            if (class07211x != null) {
               class06889 class06889 = this.method_18798();
               if (class07211x.z() == class07185.field_11048) {
                  this.method_18800(Ly[2] * class07211x.P(), class06889.B, class06889.Z);
               } else {
                  this.method_18800(class06889.M, class06889.B, Ly[3] * class07211x.T());
               }
            }
         }
      }
   }

   private void N(class07049 var1, boolean var2, boolean var3, CallbackInfoReturnable var4) {
      if (var4.getReturnValueZ() && var1 instanceof class07487 && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18)) {
         this.field_5982 = var1.method_36454();
         this.method_36456(var1.method_36454());
         this.method_5847(var1.method_36454());
      }
   }

   private void N(class06202 var1, class03448 var2, class01683 var3, class01205 var4, class01756 var5, class08687 var6, boolean var7, CallbackInfo var8) {
      this.NZ();
      this.W_6 = var6.R();
   }

   public void N(float var1, int var2, int var3) {
      if (var1 != super.fields_37fa3311b0e9d3e9b883d09222919bf5a_2) {
         this.f();
      }

      super.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = var1;
      super.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = var2;
      super.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = var3;
   }

   public void N(class08152 var1) {
      this.NZ();
      this.M_0 = var1;
   }

   @Override
   public void N(class06889 var1) {
      this.NZ();
      this.W_1 = var1;
   }

   private float W(class04453 var1) {
      this.NZ();
      return ((class11394)this.W_4).N();
   }

   private boolean R(boolean var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable(V[1], true);
      this.N(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : !this.method_74025() && (this.method_5765() ? this.y(this.method_5854()) : this.R(this)) && (var1 || !this.method_74016());
   }

   @Override
   public boolean R() {
      this.NZ();
      return (Boolean)this.W_2;
   }

   private boolean R(class04453 var1) {
      class10947 class10947 = class10947.N();
      class11938.L().L(class10947);
      return class10947.y() ? true : var1.method_76458();
   }

   private void R(CallbackInfo var1) {
      this.NZ();
      if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_9, ProtocolVersion.v1_14_4) && ((class04474)this.L_1).field_54155.R()) {
         float f = (float)(((class04474)this.L_1).field_55868.z / yG[1]);
         float f1 = (float)(((class04474)this.L_1).field_55868.U / yG[2]);
         ((class04474)this.L_1).field_55868 = new class07109(f, f1);
      }
   }

   private boolean Ni() {
      this.NZ();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable(s[6], true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : !this.R(true) || !this.method_5799() || !((class04474)this.L_1).method_20622() && !this.method_24828() && !((class04474)this.L_1).field_54155.R();
   }

   public class01205 O() {
      this.NZ();
      return (class01205)this.y_1;
   }

   private boolean Nu() {
      this.NZ();
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_1)
         ? !(((class04474)this.L_1).field_55868.U >= 0.8F) || !this.p()
         : !((class04474)this.L_1).method_20622() || !this.p();
   }

   private boolean H() {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) || !this.method_5799() || this.method_5869();
   }

   @Nullable
   public class07431 G() {
      return this.method_49694() instanceof class07431 class07431 && class07431.m() ? class07431 : null;
   }

   private void NZ() {
      if (!this.M_init) {
         this.M_init = true;
         this.M_1 = yG[6];
         this.M_2 = NG[0];
      }

      if (!this.R_init) {
         this.R_init = true;
         this.R_0 = NG[1];
         this.R_1 = 0.0F;
         this.R_2 = 0.0F;
         this.R_3 = false;
         this.R_4 = false;
         this.R_5 = false;
         this.R_6 = false;
         this.R_7 = 0;
      }

      if (!this.L_init) {
         this.L_init = true;
         this.L_0 = false;
         this.L_4 = 0;
         this.L_5 = 0;
      }

      if (!this.u_init) {
         this.u_init = true;
         this.u_0 = 0.0F;
         this.u_1 = 0.0F;
         this.u_2 = 0.0F;
      }

      if (!this.B_init) {
         this.B_init = true;
         this.B_0 = 0.0F;
         this.B_1 = 0;
         this.B_2 = 0.0F;
         this.B_3 = 0.0F;
      }

      if (!this.i_init) {
         this.i_init = true;
         this.i_0 = 0.0F;
         this.i_1 = false;
         this.i_3 = false;
         this.i_4 = false;
         this.i_5 = 0;
         this.i_6 = false;
      }

      if (!this.m_init) {
         this.m_init = true;
         this.m_0 = 0;
         this.m_1 = false;
      }

      if (!this.W_init) {
         this.W_init = true;
         this.W_0 = false;
         this.W_2 = false;
         this.W_6 = false;
      }
   }

   private static MethodHandle NR() {
      try {
         Lookup lookup = MethodHandles.publicLookup();
         return lookup.findVirtual(class04453.class, V[3], MethodType.methodType(boolean.class));
      } catch (NoSuchMethodException nosuchmethodexception) {
         return null;
      } catch (IllegalAccessException illegalaccessexception) {
         throw new RuntimeException(illegalaccessexception);
      }
   }

   public float Y() {
      return super.fields_9212a028292fd3c078969e3ee4c71d9e8_0.a_(class02484.M, class08153.N).L();
   }

   private boolean NB() {
      this.NZ();
      return this.d()
         && (Integer)this.i_5 <= 0
         && this.method_24828()
         && !this.method_21825()
         && !this.method_5765()
         && this.k()
         && this.method_23313() >= ND[3];
   }

   @Override
   public void method_7353(class00392 var1, boolean var2) {
      this.NZ();
      ((class06202)this.L_3).N().N(var1, var2);
   }

   private static Predicate NL() {
      return var0 -> {
         if (class07042.B.test(var0)) {
            class11357 class11357 = class11357.N(var0);
            class11938.L().L(class11357);
            return !class11357.y();
         } else {
            return false;
         }
      };
   }

   private static void NN() {
      yM = new double[7];
      yM[0] = Double.longBitsToDouble(0L);
      yM[1] = Double.longBitsToDouble(0L);
      yM[2] = Double.longBitsToDouble(0L);
      yM[3] = Double.longBitsToDouble(4551510721646314285L);
      yM[4] = Double.longBitsToDouble(0L);
      yM[5] = Double.longBitsToDouble(0L);
      yM[6] = Double.longBitsToDouble(9218868437227405311L);
      Ly = new double[4];
      Ly[0] = Double.longBitsToDouble(0L);
      Ly[1] = Double.longBitsToDouble(4607182418800017408L);
      Ly[2] = Double.longBitsToDouble(4591870180066957722L);
      Ly[3] = Double.longBitsToDouble(4591870180066957722L);
      t = new double[7];
      t[0] = Double.longBitsToDouble(4607182418800017408L);
      t[1] = Double.longBitsToDouble(4607182418800017408L);
      t[2] = Double.longBitsToDouble(4502148214488346440L);
      t[3] = Double.longBitsToDouble(4607182418800017408L);
      t[4] = Double.longBitsToDouble(4599976659396224614L);
      t[5] = Double.longBitsToDouble(4599976659396224614L);
      t[6] = Double.longBitsToDouble(4599976659396224614L);
      yK = new double[8];
      yK[0] = Double.longBitsToDouble(4599976659396224614L);
      yK[1] = Double.longBitsToDouble(4599976659396224614L);
      yK[2] = Double.longBitsToDouble(4599976659396224614L);
      yK[3] = Double.longBitsToDouble(4599976659396224614L);
      yK[4] = Double.longBitsToDouble(4599976659396224614L);
      yK[5] = Double.longBitsToDouble(0L);
      yK[6] = Double.longBitsToDouble(0L);
      yK[7] = Double.longBitsToDouble(0L);
      H = new double[2];
      H[0] = Double.longBitsToDouble(0L);
      H[1] = Double.longBitsToDouble(0L);
      yD = new double[5];
      yD[0] = Double.longBitsToDouble(0L);
      yD[1] = Double.longBitsToDouble(0L);
      yD[2] = Double.longBitsToDouble(0L);
      yD[3] = Double.longBitsToDouble(4602768891079294976L);
      yD[4] = Double.longBitsToDouble(0L);
      p = new double[6];
      p[0] = Double.longBitsToDouble(0L);
      p[1] = Double.longBitsToDouble(4602768891079294976L);
      p[2] = Double.longBitsToDouble(0L);
      p[3] = Double.longBitsToDouble(0L);
      p[4] = Double.longBitsToDouble(4607182418800017408L);
      p[5] = Double.longBitsToDouble(0L);
      ND = new double[6];
      ND[0] = Double.longBitsToDouble(4532020583461814272L);
      ND[1] = Double.longBitsToDouble(4532020583461814272L);
      ND[2] = Double.longBitsToDouble(4594198589319675904L);
      ND[3] = Double.longBitsToDouble(4607182418800017408L);
      ND[4] = Double.longBitsToDouble(0L);
      ND[5] = Double.longBitsToDouble(-4616189618054758400L);
      k = new double[8];
      k[0] = Double.longBitsToDouble(4607182418800017408L);
      k[1] = Double.longBitsToDouble(4600697235336603894L);
      k[2] = Double.longBitsToDouble(-4619792497756654797L);
      k[3] = Double.longBitsToDouble(4599075939470750515L);
      k[4] = Double.longBitsToDouble(4607182418800017408L);
      k[5] = Double.longBitsToDouble(4607182418800017408L);
      k[6] = Double.longBitsToDouble(4607182418800017408L);
      k[7] = Double.longBitsToDouble(4561440258104740754L);
      yG = new double[7];
      yG[0] = Double.longBitsToDouble(4605380978949069210L);
      yG[1] = Double.longBitsToDouble(4599075939470750515L);
      yG[2] = Double.longBitsToDouble(4599075939470750515L);
      yG[3] = Double.longBitsToDouble(4605380978949069210L);
      yG[4] = Double.longBitsToDouble(-4571373524106608640L);
      yG[5] = Double.longBitsToDouble(-4571373524106608640L);
      yG[6] = Double.longBitsToDouble(0L);
      NG = new double[4];
      NG[0] = Double.longBitsToDouble(0L);
      NG[1] = Double.longBitsToDouble(0L);
      NG[2] = Double.longBitsToDouble(4599976659396224614L);
      NG[3] = Double.longBitsToDouble(4594198589319675904L);
   }

   private boolean NM() {
      this.NZ();
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_1) && this.method_5869()
         ? ((class04474)this.L_1).method_20622()
         : ((class04474)this.L_1).field_55868.U >= yG[3];
   }

   private boolean Ny() {
      this.NZ();
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_1) && this.method_5869()
         ? ((class04474)this.L_1).method_20622()
         : ((class04474)this.L_1).field_55868.U >= yG[0];
   }

   @Override
   public void method_7323(class00402 var1) {
      this.NZ();
      ((class06202)this.L_3).N(new class05995(var1));
   }

   @Override
   public void method_71753(class03556<class09037> var1) {
      this.NZ();
      ((class01683)this.y_0).N(var1, (class05096)((class06202)this.L_3).v_3);
   }

   @Override
   public void method_7311(class07267 var1, boolean var2) {
      this.NZ();
      if (var1 instanceof class03786 class03786) {
         ((class06202)this.L_3).N(new class03777(class03786, var2, ((class06202)this.L_3).yi()));
      } else {
         ((class06202)this.L_3).N(new class01337(var1, var2, ((class06202)this.L_3).yi()));
      }
   }

   @Override
   public void method_7355() {
      this.NZ();
      ((class01683)this.y_0).N(new class07343(this.method_31549()));
   }

   @Override
   public void method_7315(class06584 var1, class07050 var2) {
      this.NZ();
      class02699 class02699 = var1.method_58694(class02484.Ny);
      if (class02699 != null) {
         ((class06202)this.L_3).N(new class05884(this, var1, var2, class02699));
      }
   }

   @Override
   public void method_6104(class07050 var1) {
      this.NZ();
      super.method_6104(var1);
      ((class01683)this.y_0).N(new class07831(var1));
   }

   @Override
   public void method_66282() {
      this.NZ();
      if (this.J()) {
         class07109 class07109 = ((class04474)this.L_1).method_3128();
         class07109 class07109x = this.N(this, class07109);
         float f = class07109x.z;
         this.u(null);
         super.fields_7212a028292fd3c078969e3ee4c71d9e8_0 = f;
         super.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = class07109x.U;
         super.fields_6212a028292fd3c078969e3ee4c71d9e8_4 = ((class04474)this.L_1).field_54155.i();
         this.u_2 = (Float)this.u_0;
         this.B_0 = (Float)this.u_1;
         this.u_1 = (Float)this.u_1 + (this.W(this) - (Float)this.u_1) * 0.5F;
         this.u_0 = (Float)this.u_0 + (this.M(this) - (Float)this.u_0) * 0.5F;
      } else {
         super.method_66282();
      }
   }

   @Override
   public boolean method_6115() {
      this.NZ();
      return (Boolean)this.i_1;
   }

   @Override
   public boolean method_21754() {
      return !this.method_31549().y && super.method_21754();
   }

   @Override
   public void method_6007() {
      this.NZ();
      LocalBooleanRefImpl localbooleanrefimpl = new LocalBooleanRefImpl();
      localbooleanrefimpl.init(false);
      this.N_45(null, localbooleanrefimpl);
      if ((Integer)this.L_4 > 0) {
         this.L_4 = (Integer)this.L_4 - 1;
      }

      if (!((class05096)((class06202)this.L_3).v_3 instanceof class05850)) {
         this.B(this.b() == class02244.field_52061);
         this.method_5760();
      }

      boolean flag = ((class04474)this.L_1).field_54155.i();
      boolean flag1 = ((class04474)this.L_1).field_54155.R();
      class04474 class04474x = (class04474)this.L_1;
      boolean flag2 = this.N(class04474x, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, V[4]);
         return ((class04474)var0[0]).method_20622();
      });
      class08033 class08033 = this.method_31549();
      this.R_5 = !class08033.y
         && !this.i(this)
         && !this.b(this)
         && this.method_52558(class01312.field_18081)
         && (this.method_5715() || !this.method_6113() && !this.method_52558(class01312.field_18076));
      class04474 class04474x = (class04474)this.L_1;
      this.y(null);
      class04474x.method_3129();
      ((class06202)this.L_3).yT().N((class04474)this.L_1);
      this.L(null);
      boolean flag3 = false;
      if ((Integer)this.i_5 > 0) {
         this.i_5 = (Integer)this.i_5 - 1;
         flag3 = true;
         ((class04474)this.L_1).method_64054();
      }

      if (!this.field_5960) {
         this.N(this.method_23317() - this.method_17681() * t[4], this.method_23321() + this.method_17681() * t[5]);
         this.N(this.method_23317() - this.method_17681() * t[6], this.method_23321() - this.method_17681() * yK[0]);
         this.N(this.method_23317() + this.method_17681() * yK[1], this.method_23321() - this.method_17681() * yK[2]);
         this.N(this.method_23317() + this.method_17681() * yK[3], this.method_23321() + this.method_17681() * yK[4]);
      }

      label194: {
         if (!flag1 && (!this.x() || this.method_5765())) {
            class08687 class08687xx = ((class04474)this.L_1).field_54155;
            if (!this.y(class08687xx)) {
               break label194;
            }
         }

         this.L_4 = 0;
      }

      if (this.N(this, localbooleanrefimpl)) {
         if (!flag2) {
            if ((Integer)this.L_4 > 0) {
               this.method_5728(true);
            } else {
               this.L_4 = ((class05630)((class06202)this.L_3).i_7).Nn().method_41753();
            }
         }

         class08687 class08687x = ((class04474)this.L_1).field_54155;
         if (this.N(class08687x)) {
            this.method_5728(true);
         }
      }

      if (this.method_5624()) {
         if (this.method_5681()) {
            if (this.Ni()) {
               this.method_5728(false);
            }
         } else if (this.T(this)) {
            this.method_5728(false);
         }
      }

      boolean flag4 = false;
      if (this.N(class08033)) {
         if (((class03443)((class06202)this.L_3).T_2).Z()) {
            if (!class08033.y) {
               class08033.y = true;
               flag4 = true;
               this.method_7355();
            }
         } else if (!flag && ((class04474)this.L_1).field_54155.i() && !flag3) {
            if (super.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 == 0) {
               super.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 = 7;
            } else if (!this.method_5681() && (this.method_5854() == null || this.G() != null)) {
               class08033.y = !class08033.y;
               if (class08033.y && this.method_24828() && this.B(this)) {
                  this.method_6043();
               }

               flag4 = true;
               this.method_7355();
               super.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
            }
         }
      }

      if (((class04474)this.L_1).field_54155.i() && !flag4 && !flag && !this.M(this.method_6101()) && this.N(this)) {
         ((class01683)this.y_0).N(new class07375(this, class07363.field_12982));
      }

      this.i_6 = this.method_6128();
      if (this.m(this) && ((class04474)this.L_1).field_54155.R() && this.method_29920()) {
         this.method_6093();
      }

      if (this.method_5777(class01231.N)) {
         int i = this.method_7325() ? 10 : 1;
         this.m_0 = class04995.N((Integer)this.m_0 + i, 0, 600);
      } else if ((Integer)this.m_0 > 0) {
         this.method_5777(class01231.N);
         this.m_0 = class04995.N((Integer)this.m_0 - 10, 0, 600);
      }

      if (class08033.y && this.J()) {
         int j = 0;
         class08687 class08687 = ((class04474)this.L_1).field_54155;
         this.R(null);
         if (class08687.R()) {
            j--;
         }

         if (((class04474)this.L_1).field_54155.i()) {
            j++;
         }

         if (j != 0) {
            this.method_18799(this.method_18798().y(yK[5], j * class08033.N() * 3.0F, yK[6]));
         }
      }

      class07431 class07431 = this.G();
      if (class07431 != null && class07431.n() == 0) {
         if ((Integer)this.B_1 < 0) {
            this.B_1 = (Integer)this.B_1 + 1;
            if ((Integer)this.B_1 == 0) {
               this.B_2 = 0.0F;
            }
         }

         if (flag && !((class04474)this.L_1).field_54155.i()) {
            this.B_1 = -10;
            class07431.N(class04995.y(this.P() * 100.0F));
            this.v();
         } else if (!flag && ((class04474)this.L_1).field_54155.i()) {
            this.B_1 = 0;
            this.B_2 = 0.0F;
         } else if (flag) {
            this.B_1 = (Integer)this.B_1 + 1;
            if ((Integer)this.B_1 < 10) {
               this.B_2 = ((Integer)this.B_1).intValue() * 0.1F;
            } else {
               this.B_2 = 0.8F + 2.0F / ((Integer)this.B_1 - 9) * 0.1F;
            }
         }
      } else {
         this.B_2 = 0.0F;
      }

      super.method_6007();
      if (this.method_24828() && class08033.y && !((class03443)((class06202)this.L_3).T_2).Z()) {
         class08033.y = false;
         this.method_7355();
      }
   }

   @Override
   public void method_6025(float var1) {
   }

   @Override
   public void method_6019(class07050 var1) {
      this.NZ();
      if (!this.method_5998(var1).R() && !this.method_6115()) {
         super.method_6019(var1);
         this.i_1 = true;
         this.i_2 = var1;
      }
   }

   @Override
   public class07050 method_6058() {
      this.NZ();
      return Objects.requireNonNullElse((class07050)this.i_2, class07050.field_5808);
   }

   @Override
   public void method_6021() {
      this.NZ();
      super.method_6021();
      this.i_1 = false;
   }

   @Override
   public void method_6108() {
      super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 = super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 + 1;
      if (super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 == 20) {
         this.method_5650(class07062.field_26998);
      }
   }

   @Override
   public void method_7346() {
      this.NZ();
      ((class01683)this.y_0).N(new class00543(((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b));
      this.t();
   }

   @Override
   public void method_7277(class07049 var1) {
      this.NZ();
      ((class04410)((class06202)this.L_3).i_0).N(var1, class07107.M);
   }

   @Override
   public class08152 method_75004() {
      this.NZ();
      return (class08152)this.M_0;
   }

   @Override
   public void method_7304(class07049 var1) {
      this.NZ();
      ((class04410)((class06202)this.L_3).i_0).N(var1, class07107.j);
   }

   @Override
   public boolean method_33793() {
      this.NZ();
      return ((class06202)this.L_3).yi();
   }

   @Override
   public boolean method_61498() {
      this.NZ();
      return ((class05630)((class06202)this.L_3).i_7).C().method_41753();
   }

   @Override
   public void method_33592(class06584 var1, class06584 var2, class05442 var3) {
      this.NZ();
      ((class06202)this.L_3).yT().N(var1, var2, var3);
   }

   @Override
   public void method_7268(boolean var1) {
      this.NZ();
      super.method_7268(var1);
      ((class05731)((class06202)this.L_3).L_0).i();
   }

   @Override
   public void method_7257(class07480 var1) {
      this.NZ();
      ((class06202)this.L_3).N(new class01352(var1));
   }

   @Override
   public void method_66695(class08594 var1) {
      this.NZ();
      ((class06202)this.L_3).N(new class00197(var1));
   }

   @Override
   public boolean method_64271() {
      this.NZ();
      return ((class08722)this.y_3).L();
   }

   @Override
   public void method_7303(class07253 var1) {
      this.NZ();
      ((class06202)this.L_3).N(new class01359(var1));
   }

   @Override
   public void method_61499(class06584 var1) {
      this.NZ();
      ((class03443)((class06202)this.L_3).T_2).N(var1);
   }

   @Override
   public void method_16354(class04858 var1) {
      this.NZ();
      ((class06202)this.L_3).N(new class06087(var1));
   }

   @Override
   public boolean method_7295() {
      this.NZ();
      boolean flag = super.fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
      boolean flag1 = super.method_7295();
      if (this.method_7325()) {
         return super.fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
      } else {
         if (!flag && flag1) {
            this.method_73183()
               .method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.l, class04911.field_15256, 1.0F, 1.0F, false);
            ((class06202)this.L_3).Nr().N((class00044)(new class09052(this)));
         }

         if (flag && !flag1) {
            this.method_73183()
               .method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.d, class04911.field_15256, 1.0F, 1.0F, false);
         }

         return super.fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
      }
   }

   @Override
   public void method_66696(class08610 var1) {
      this.NZ();
      ((class06202)this.L_3).N(new class00231(var1));
   }

   @Override
   public boolean method_7340() {
      return true;
   }

   public float getCurrentConstantMood() {
      this.NZ();

      for (class00169 class00169 : (List)this.y_4) {
         if (class00169 instanceof class05397) {
            return ((BiomeAmbienceInterface)class00169).getConstantMood();
         }
      }

      return 0.0F;
   }
}
