/*
 * xnat-testatul: org.nrg.xnat.testatul.plugin.SimpleAnnotation
 * XNAT http://www.xnat.org
 * Copyright (c) 2017, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.testatul.plugin;

public @interface SimpleAnnotation {
    int value() default 0;
    String name() default "";
}
