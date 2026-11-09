package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import de.maxhenkel.voicechat.resourcepacks.IPackRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01623 implements IPackRepository {
   public Set<class01057> N;
   private Map<String, class01055> y = ImmutableMap.of();
   private List<class01055> L = ImmutableList.of();
   private static final Logger u = LoggerFactory.getLogger("PackRepositoryMixin");

   public Collection<String> L() {
      return this.y.keySet();
   }

   @Nullable
   public class01055 L(String var1) {
      return this.y.get(var1);
   }

   private List<class01055> L(Collection<String> var1) {
      List list = this.u(var1).collect(class07536.y());

      for (class01055 class01055 : this.y.values()) {
         if (class01055.Z() && !list.contains(class01055)) {
            class01055.U().N(list, class01055, class01055::B, false);
         }
      }

      this.N(var1, null, list);
      return ImmutableList.copyOf(list);
   }

   public Collection<class01055> M() {
      return this.L;
   }

   public class01623(class01057... var1) {
      super();
      this.N = ImmutableSet.copyOf(var1);
      this.N(var1, null);
   }

   public List<class01622> B() {
      return this.L.stream().map(class01055::R).collect(ImmutableList.toImmutableList());
   }

   private Map<String, class01055> Z() {
      TreeMap treemap = Maps.newTreeMap();
      Iterator iterator = this.N.iterator();

      while (iterator.hasNext()) {
         ((class01057)iterator.next()).method_14453(var1x -> treemap.put(var1x.M(), var1x));
      }

      return ImmutableMap.copyOf(treemap);
   }

   public Collection<String> i() {
      return this.L.stream().map(class01055::M).collect(ImmutableSet.toImmutableSet());
   }

   public Collection<class01055> u() {
      return this.y.values();
   }

   public boolean u(String var1) {
      return this.y.containsKey(var1);
   }

   private Stream<class01055> u(Collection<String> var1) {
      return var1.stream().map(this.y::get).filter(Objects::nonNull);
   }

   public boolean y(String var1) {
      class01055 class01055 = this.y.get(var1);
      if (class01055 != null && this.L.contains(class01055)) {
         ArrayList arraylist = Lists.newArrayList(this.L);
         this.y(var1, null, arraylist);
         arraylist.remove(class01055);
         this.L = arraylist;
         return true;
      } else {
         return false;
      }
   }

   private void y(String var1, CallbackInfoReturnable var2, List var3) {
      if (ModResourcePackCreator.POST_CHANGE_HANDLE_REQUIRED.contains(var1)) {
         Set set = var3.stream().map(class01055::M).collect(Collectors.toSet());
         var3.removeIf(var1x -> !var1x.fabric$parentsEnabled(set));
         u.debug("[Fabric] Internal pack auto-removed upon disabling {}, result: {}", var1, var3.stream().map(class01055::M).toList());
      }
   }

   public boolean y() {
      List list = this.L(List.of());
      return !this.L.equals(list);
   }

   public void y(Collection<String> var1) {
      this.L = this.L(var1);
   }

   private void N(Collection var1, CallbackInfoReturnable var2, List var3) {
      ModPackResourcesUtil.refreshAutoEnabledPacks(var3, this.y);
   }

   public void N(class01057[] var1, CallbackInfo var2) {
      this.N = new LinkedHashSet<>(this.N);
      boolean flag = false;

      for (class01057 class01057 : this.N) {
         if (class01057 instanceof class01626 && (((class01626)class01057).y == class01283.i || ((class01626)class01057).y == class01283.R)) {
            flag = true;
            break;
         }
      }

      if (flag) {
         this.N.add(new ModResourcePackCreator(class01603.field_14190));
      }
   }

   private void N(String var1, CallbackInfoReturnable var2, List var3) {
      if (ModResourcePackCreator.POST_CHANGE_HANDLE_REQUIRED.contains(var1)) {
         ModPackResourcesUtil.refreshAutoEnabledPacks(var3, this.y);
      }
   }

   public static String N(Collection<class01055> var0) {
      return var0.stream().map(var0x -> var0x.M() + (var0x.u().N() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
   }

   public void N() {
      List list = this.L.stream().map(class01055::M).collect(ImmutableList.toImmutableList());
      this.y = this.Z();
      this.L = this.L(list);
   }

   public boolean N(String var1) {
      class01055 class01055 = this.y.get(var1);
      if (class01055 != null && !this.L.contains(class01055)) {
         ArrayList arraylist = Lists.newArrayList(this.L);
         arraylist.add(class01055);
         this.N(var1, null, arraylist);
         this.L = arraylist;
         return true;
      } else {
         return false;
      }
   }

   public void voicechat$addSource(class01057 var1) {
      HashSet hashset = new HashSet<>(this.N);
      hashset.add(var1);
      this.N = hashset;
   }

   public class03767 R() {
      return this.M().stream().map(class01055::i).reduce(class03767::L).orElse(class03767.N());
   }
}
