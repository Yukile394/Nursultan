package minecraft;

import Nursultan.class10685;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntriesAll;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupImpl;
import net.fabricmc.fabric.impl.itemgroup.ItemGroupEventsImpl;
import net.fabricmc.fabric.mixin.itemgroup.CreativeModeTabAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06911 implements FabricItemGroupImpl, CreativeModeTabAccessor {
   static final class01894 N = N("items");
   private final class00392 R;
   class01894 y;
   boolean L;
   boolean u;
   boolean i;
   private class06909 M;
   private int B;
   private final class06936 Z;
   @Nullable
   private class06584 z;
   private Collection<class06584> U;
   private Set<class06584> E;
   private final Supplier<class06584> W;
   private final class06950 m;
   private int P = -1;

   public class01894 L() {
      return this.y;
   }

   public class06909 M() {
      return this.M;
   }

   class06911(class06909 var1, int var2, class06936 var3, class00392 var4, Supplier<class06584> var5, class06950 var6) {
      super();
      this.y = N;
      this.L = true;
      this.u = true;
      this.i = false;
      this.U = class03778.N();
      this.E = class03778.N();
      this.M = var1;
      this.B = var2;
      this.R = var4;
      this.W = var5;
      this.m = var6;
      this.Z = var3;
   }

   public boolean B() {
      return !this.U.isEmpty();
   }

   public boolean Z() {
      return this.Z != class06936.field_41052 || this.B();
   }

   public boolean i() {
      return this.L;
   }

   public class06936 U() {
      return this.Z;
   }

   public boolean z() {
      return this.i;
   }

   public boolean u() {
      return this.u;
   }

   public class06584 y() {
      if (this.z == null) {
         this.z = this.W.get();
      }

      return this.z;
   }

   public Collection<class06584> E() {
      return this.U;
   }

   public static class06921 N(class06909 var0, int var1) {
      return new class06921(var0, var1);
   }

   public static class01894 N(String var0) {
      return class01894.y("textures/gui/container/creative_inventory/tab_" + var0 + ".png");
   }

   public void N(class06945 var1, CallbackInfo var2) {
      class05946<class06911> class05946 = class04206.Nz.u(this).orElseThrow(() -> new IllegalStateException("Unregistered item group : " + this));
      if (!this.z() || class05946 == class03771.W) {
         Objects.requireNonNull(this.U, "displayStacks");
         Objects.requireNonNull(this.E, "searchTabStacks");
         LinkedList linkedlist = new LinkedList<>(this.U);
         LinkedList linkedlist1 = new LinkedList<>(this.E);
         FabricItemGroupEntries fabricitemgroupentries = new FabricItemGroupEntries(var1, linkedlist, linkedlist1);
         if (class05946 != class03771.W || var1.y()) {
            Event<ModifyEntries> event = ItemGroupEventsImpl.getModifyEntriesEvent(class05946);
            if (event != null) {
               ((ModifyEntries)event.invoker()).modifyEntries(fabricitemgroupentries);
            }

            ((ModifyEntriesAll)ItemGroupEvents.MODIFY_ENTRIES_ALL.invoker()).modifyEntries(this, fabricitemgroupentries);
         }

         this.U.clear();
         this.U.addAll(linkedlist);
         this.E.clear();
         this.E.addAll(linkedlist1);
      }
   }

   public class00392 N() {
      return this.R;
   }

   public boolean N(class06584 var1) {
      return this.E.contains(var1);
   }

   public void N(class06945 var1) {
      class10685 class10685 = new class10685(this, var1.N());
      class05946<class06911> class05946 = class04206.Nz.u(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.m.accept(var1, class10685);
      this.U = class10685.N;
      this.E = class10685.y;
      this.N(var1, null);
   }

   public Collection<class06584> W() {
      return this.E;
   }

   public int R() {
      return this.B;
   }

   public void fabric_setPage(int var1) {
      this.P = var1;
   }

   public int fabric_getPage() {
      if (this.P < 0) {
         throw new IllegalStateException("Item group has no page");
      } else {
         return this.P;
      }
   }
}
