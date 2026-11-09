package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;

public abstract class class08224<T extends Runnable> implements class02510, class08199<T>, Runnable {
   private static final Logger N = LogUtils.getLogger();
   private final AtomicReference<class08198> y = new AtomicReference<>(class08198.field_54074);
   private final class05678<T> L;
   private final Executor u;
   private final String i;

   public boolean L() {
      return this.U() && !this.L.y();
   }

   private boolean M() {
      if (!this.U()) {
         return false;
      } else {
         Runnable runnable = this.L.N();
         if (runnable == null) {
            return false;
         } else {
            class07536.N(runnable, this.i);
            return true;
         }
      }
   }

   public class08224(class05678<T> var1, Executor var2, String var3) {
      super();
      this.u = var2;
      this.L = var1;
      this.i = var3;
      class02672.N.N(this);
   }

   @Override
   public void run() {
      try {
         this.M();
      } finally {
         this.z();
         this.B();
      }
   }

   @Override
   public String toString() {
      return this.i + " " + this.y.get() + " " + this.L.y();
   }

   private void B() {
      if (this.R() && this.Z()) {
         try {
            this.u.execute(this);
         } catch (RejectedExecutionException rejectedexecutionexception1) {
            try {
               this.u.execute(this);
            } catch (RejectedExecutionException rejectedexecutionexception) {
               N.error("Could not schedule ConsecutiveExecutor", rejectedexecutionexception);
            }
         }
      }
   }

   private boolean Z() {
      return this.y.compareAndSet(class08198.field_54074, class08198.field_54075);
   }

   private boolean U() {
      return this.y.get() == class08198.field_54075;
   }

   @Override
   public void close() {
      this.y.set(class08198.field_54076);
   }

   private void z() {
      this.y.compareAndSet(class08198.field_54075, class08198.field_54074);
   }

   public int y() {
      return this.L.L();
   }

   private boolean E() {
      return this.y.get() == class08198.field_54076;
   }

   public void N() {
      try {
         while (this.M()) {
         }
      } finally {
         this.z();
         this.B();
      }
   }

   @Override
   public void N(T var1) {
      this.L.N((T)var1);
      this.B();
   }

   private boolean R() {
      return !this.E() && !this.L.y();
   }

   @Override
   public String as_() {
      return this.i;
   }

   @Override
   public List<class04530> at_() {
      return ImmutableList.of(class04530.N(this.i + "-queue-size", class02253.field_54068, this::y));
   }
}
