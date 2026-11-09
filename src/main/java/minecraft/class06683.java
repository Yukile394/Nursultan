package minecraft;

import Nursultan.class10640;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06683 {
   public static final String N = "#";
   private static final Logger y = LogUtils.getLogger();
   private final Object2ObjectMap<String, class00518> L = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<class06675, List<class00518>> u = new Reference2ObjectOpenHashMap();
   private final Map<String, class01770> i = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<class01890, class00518> R = new EnumMap<>(class01890.class);
   private final Object2ObjectMap<String, class00502> M = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, class00502> B = new Object2ObjectOpenHashMap();

   public void L(class01766 var1) {
   }

   public Collection<class01766> L() {
      return this.i.keySet().stream().map(class01766::N).toList();
   }

   public class00502 L(String var1) {
      class00502 class00502 = this.y(var1);
      if (class00502 != null) {
         y.warn("Requested creation of existing team '{}'", var1);
         return class00502;
      } else {
         class00502 = new class00502(this, var1);
         this.M.put(var1, class00502);
         this.y(class00502);
         return class00502;
      }
   }

   public void L(class01766 var1, class00518 var2) {
      class01770 class01770 = this.i.get(var1.method_5820());
      if (class01770 != null) {
         boolean flag = class01770.y(var2);
         if (!class01770.N()) {
            if (this.i.remove(var1.method_5820()) != null) {
               this.L(var1);
            }
         } else if (flag) {
            this.i(var1, var2);
         }
      }
   }

   public void L(class00502 var1) {
   }

   public void L(class00518 var1) {
   }

   protected List<class00497> M() {
      return this.i().stream().map(class00502::N).toList();
   }

   public class06683() {
      super();
   }

   protected List<class00493> B() {
      return this.N().stream().map(class00518::N).toList();
   }

   protected Map<class01890, String> Z() {
      EnumMap enummap = new EnumMap<>(class01890.class);

      for (class01890 class01890 : class01890.values()) {
         class00518 class00518 = this.N(class01890);
         if (class00518 != null) {
            enummap.put(class01890, class00518.L());
         }
      }

      return enummap;
   }

   public void i(class00518 var1) {
   }

   public void i(class01766 var1, class00518 var2) {
   }

   public Collection<class00502> i() {
      return this.M.values();
   }

   @Nullable
   public class00502 i(String var1) {
      return (class00502)this.B.get(var1);
   }

   public boolean u(String var1) {
      class00502 class00502 = this.i(var1);
      if (class00502 != null) {
         this.y(var1, class00502);
         return true;
      } else {
         return false;
      }
   }

   public Collection<String> u() {
      return this.M.keySet();
   }

   public void u(class00518 var1) {
   }

   public void u(class01766 var1, class00518 var2) {
   }

   public void u(class00502 var1) {
   }

   @Nullable
   public class00502 y(String var1) {
      return (class00502)this.M.get(var1);
   }

   public void y(class00518 var1) {
      this.L.remove(var1.L());

      for (class01890 class01890 : class01890.values()) {
         if (this.N(class01890) == var1) {
            this.N(class01890, null);
         }
      }

      List<class00518> list = (List<class00518>)this.u.get(var1.u());
      if (list != null) {
         list.remove(var1);
      }

      for (class01770 class01770 : this.i.values()) {
         class01770.y(var1);
      }

      this.i(var1);
   }

   public Object2IntMap<class00518> y(class01766 var1) {
      class01770 class01770 = this.i.get(var1.method_5820());
      return class01770 != null ? class01770.y() : Object2IntMaps.emptyMap();
   }

   public void y(class00502 var1) {
   }

   public void y(String var1, class00502 var2) {
      if (this.i(var1) != var2) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + var2.L() + "'.");
      } else {
         this.B.remove(var1);
         var2.B().remove(var1);
      }
   }

   public Collection<String> y() {
      return this.L.keySet();
   }

   @Nullable
   public class01788 y(class01766 var1, class00518 var2) {
      class01770 class01770 = this.i.get(var1.method_5820());
      return class01770 != null ? class01770.N(var2) : null;
   }

   public Collection<class00518> N() {
      return this.L.values();
   }

   protected void N(class00493 var1) {
      this.N(var1.N(), var1.y(), var1.L(), var1.u(), var1.i(), var1.R().orElse(null));
   }

   public class00518 N(String var1, class06675 var2, class00392 var3, class06640 var4, boolean var5, @Nullable class01762 var6) {
      if (this.L.containsKey(var1)) {
         throw new IllegalArgumentException("An objective with the name '" + var1 + "' already exists!");
      } else {
         class00518 class00518 = new class00518(this, var1, var2, var3, var4, var5, var6);
         ((List)this.u.computeIfAbsent(var2, var0 -> Lists.newArrayList())).add(class00518);
         this.L.put(var1, class00518);
         this.L(class00518);
         return class00518;
      }
   }

   public void N(class01766 var1) {
      if (this.i.remove(var1.method_5820()) != null) {
         this.L(var1);
      }
   }

   protected void N(class00497 var1) {
      class00502 class00502 = this.L(var1.N());
      var1.y().ifPresent(class00502::N);
      var1.L().ifPresent(class00502::N);
      class00502.N(var1.u());
      class00502.y(var1.i());
      class00502.y(var1.R());
      class00502.L(var1.M());
      class00502.N(var1.B());
      class00502.y(var1.Z());
      class00502.N(var1.z());

      for (String s : var1.U()) {
         this.N(s, class00502);
      }
   }

   @Nullable
   public class00518 N(@Nullable String var1) {
      return (class00518)this.L.get(var1);
   }

   public boolean N(String var1, class00502 var2) {
      if (this.i(var1) != null) {
         this.u(var1);
      }

      this.B.put(var1, var2);
      return var2.B().add(var1);
   }

   public void N(class01766 var1, class00518 var2, class00490 var3) {
   }

   public void N(class01890 var1, @Nullable class00518 var2) {
      this.R.put(var1, var2);
   }

   @Nullable
   public class00518 N(class01890 var1) {
      return this.R.get(var1);
   }

   public class01765 N(class01766 var1, class00518 var2) {
      return this.N(var1, var2, false);
   }

   public class01765 N(class01766 var1, class00518 var2, boolean var3) {
      boolean flag = var3 || !var2.u().L();
      class01770 class01770 = this.R(var1.method_5820());
      MutableBoolean mutableboolean = new MutableBoolean();
      class00490 class00490 = class01770.N(var2, var1x -> mutableboolean.setTrue());
      return new class10640(this, class00490, flag, mutableboolean, var2, var1);
   }

   public void N(class00502 var1) {
      this.M.remove(var1.L());

      for (String s : var1.B()) {
         this.B.remove(s);
      }

      this.u(var1);
   }

   protected void N(class06679 var1) {
      class00518 class00518 = this.N(var1.y());
      if (class00518 == null) {
         y.error("Unknown objective {} for name {}, ignoring", var1.y(), var1.N());
      } else {
         this.R(var1.N()).N(class00518, new class00490(var1.L()));
      }
   }

   public Collection<class01772> N(class00518 var1) {
      ArrayList arraylist = new ArrayList();
      this.i.forEach((var2x, var3) -> {
         class00490 class00490 = var3.N(var1);
         if (class00490 != null) {
            arraylist.add(new class01772(var2x, class00490.y(), class00490.u(), class00490.i()));
         }
      });
      return arraylist;
   }

   public final void N(class06675 var1, class01766 var2, Consumer<class01765> var3) {
      ((List)this.u.getOrDefault(var1, Collections.emptyList())).forEach(var3x -> var3.accept(this.N(var2, var3x, true)));
   }

   public void N(class07049 var1) {
      if (!(var1 instanceof class08036) && !var1.method_5805()) {
         this.N((class01766)var1);
         this.u(var1.method_5820());
      }
   }

   private class01770 R(String var1) {
      return this.i.computeIfAbsent(var1, var0 -> new class01770());
   }

   protected List<class06679> R() {
      return this.i.entrySet().stream().flatMap(var0 -> {
         String s = var0.getKey();
         return var0.getValue().L().entrySet().stream().map(var1x -> new class06679(s, var1x.getKey().L(), var1x.getValue().N()));
      }).toList();
   }
}
