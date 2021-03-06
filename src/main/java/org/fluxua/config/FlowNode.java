/*
 * Fluxua: A simple Hadoop map reduce workflow engine
 * Author: Pranab Ghosh
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.fluxua.config;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pranab
 */
public class FlowNode {
    private String job;
    private List<String> preReqJobs = new ArrayList<String>();

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return the preReqJobs
     */
    public List<String> getPreReqJobs() {
        return preReqJobs;
    }

    /**
     * @param preReqJobs the preReqJobs to set
     */
    public void setPreReqJobs(List<String> preReqJobs) {
        this.preReqJobs = preReqJobs;
    }

}
