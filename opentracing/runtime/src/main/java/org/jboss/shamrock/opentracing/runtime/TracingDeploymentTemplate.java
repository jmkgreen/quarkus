package org.jboss.shamrock.opentracing.runtime;

import org.jboss.shamrock.runtime.Template;

import io.opentracing.util.GlobalTracer;

/**
 * Created by bob on 8/6/18.
 */
@Template
public class TracingDeploymentTemplate {
    private static volatile boolean registered;

    public void registerTracer() {
        if (!registered) {
            System.err.println("REGISTER TRACER");
            //this.tracer = new ShamrockTracer();
            GlobalTracer.register(new ShamrockTracer());
            registered = true;
        }
    }

}

