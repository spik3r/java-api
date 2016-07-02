package com.titanitestudios.transaction.impl;

import com.titanitestudios.transaction.SankarBo;

import java.util.Date;

/**
 * @author Kai.
 */

public class SankarBoImpl implements SankarBo {

    @Override public String hello() {
        return "Hello Sankar " + new Date();
    }
}
