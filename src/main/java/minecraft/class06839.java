package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import net.fabricmc.fabric.api.gamerule.v1.CustomGameRuleCategory;
import net.fabricmc.fabric.impl.gamerule.RuleCategoryExtensions;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import org.jspecify.annotations.Nullable;

public final class class06839<T> implements class02995, RuleCategoryExtensions, RuleTypeExtensions {
   private final class05086 N;
   private final class07411 y;
   private final ArgumentType<T> L;
   private final class07320<T> u;
   private final Codec<T> i;
   private final ToIntFunction<T> R;
   private final T M;
   private final class03767 B;
   @Nullable
   private CustomGameRuleCategory Z;
   @Nullable
   private FabricGameRuleType z;
   private final List U = new ArrayList();

   private DataResult L(String var1) {
      try {
         StringReader stringreader = new StringReader(var1);
         Object object = this.L.parse(stringreader);
         return stringreader.canRead() ? DataResult.error(() -> "Failed to deserialize; trailing characters", object) : DataResult.success(object);
      } catch (CommandSyntaxException commandsyntaxexception) {
         return DataResult.error(() -> "Failed to deserialize");
      }
   }

   public String L() {
      return class07536.N("gamerule", this.y());
   }

   public ArgumentType<T> M() {
      return this.L;
   }

   public class06839(class05086 var1, class07411 var2, ArgumentType<T> var3, class07320<T> var4, Codec<T> var5, ToIntFunction<T> var6, T var7, class03767 var8) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = (T)var7;
      this.B = var8;
   }

   @Override
   public String toString() {
      return this.N();
   }

   public Codec<T> B() {
      return this.i;
   }

   public T Z() {
      return this.M;
   }

   public class05086 i() {
      return this.N;
   }

   public Class<T> u() {
      return (Class<T>)this.M.getClass();
   }

   public class01894 y() {
      return Objects.requireNonNull(class04206.Nm.y(this));
   }

   public int y(T var1) {
      return this.R.applyAsInt((T)var1);
   }

   private DataResult N(String var1, Operation var2) {
      if (this.fabric_getType() != FabricGameRuleType.ENUM) {
         return (DataResult)var2.call(new Object[]{var1});
      } else {
         try {
            Class oclass = this.u();
            Enum oenum = Enum.valueOf(oclass, var1);
            return !this.U.contains(oenum)
               ? DataResult.error(() -> "Failed to parse rule of value " + var1 + " for rule of type " + oclass + " because the value is unsupported.")
               : DataResult.success(oenum);
         } catch (IllegalArgumentException illegalargumentexception) {
            return DataResult.error(() -> "Failed to parse rule of value " + var1 + " for rule of type " + this.u());
         }
      }
   }

   public void N(class05706 var1) {
      this.u.call(var1, this);
   }

   public DataResult<T> N(String var1) {
      return this.N(var1, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 1, "[java.lang.String]");
         return this.L((String)var1x[0]);
      });
   }

   public String N(T var1) {
      return var1.toString();
   }

   public String N() {
      return this.y().R();
   }

   public class07411 R() {
      return this.y;
   }

   @Override
   public class03767 method_45322() {
      return this.B;
   }

   @Nullable
   public FabricGameRuleType fabric_getType() {
      return this.z;
   }

   public void fabric_setType(FabricGameRuleType var1) {
      this.z = var1;
   }

   public Enum fabric_enumCycle(Enum var1) {
      if (this.fabric_getType() != FabricGameRuleType.ENUM) {
         return super.fabric_enumCycle(var1);
      } else {
         int ix = this.U.indexOf(var1);
         if (ix < 0) {
            throw new IllegalArgumentException(String.format("Invalid value: %s", var1));
         } else {
            return (Enum)this.U.get((ix + 1) % this.U.size());
         }
      }
   }

   public Iterable fabric_getSupportedEnumValues() {
      return (Iterable)(this.fabric_getType() != FabricGameRuleType.ENUM ? super.fabric_getSupportedEnumValues() : this.U);
   }

   public void fabric_setSupportedEnumValues(Enum[] var1) {
      if (this.fabric_getType() != FabricGameRuleType.ENUM) {
         super.fabric_setSupportedEnumValues(var1);
      } else {
         this.U.clear();
         Collections.addAll(this.U, var1);
      }
   }

   public CustomGameRuleCategory fabric_getCustomCategory() {
      return this.Z;
   }

   public void fabric_setCustomCategory(CustomGameRuleCategory var1) {
      this.Z = var1;
   }
}
