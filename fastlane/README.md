---
created by Bhavin_Solanki
---


--------------------------------------------  fastlane setup  -----------------------------------------------------------

# Fast Installation

Install fastlane with following commands (You can run on studio terminal)


WARNING: fastlane requires your locale to be set to UTF-8.
# export LC_ALL=en_US.UTF-8
# export LANG=en_US.UTF-8

----------------------------------------------------------------------------------------

Run this command first to remove your permission error

# - chmod +x gradlew

Init fastlane with following command 

# fastlane init

after hit above command you have auto-generated file Gemfile , Gemfile.lock and fastlane folder inside your main project)
(fastlane folder contains 3 files Appfile , Fastfile , Pluginfile)

----------------------------------------------------------------------------------------

You can also add gem as per your requirements

# sudo gem install fastlane -NV 



--------------------------------------------  fastlane setup done -----------------------------------------------------------





-------------------------------------------- github commit and push code ----------------------------------------------------



Add following to your fastfile 

   lane :uploadToGit do
       git_add(path: "*")
       git_commit(
           path: "*", 
           message: "#" + UPDATED_VERSION_CODE + " released"  
       )
       push_to_git_remote(
            remote: "origin",         # optional, default: "origin"
            local_branch: "develop",  # optional, aliased by "branch", default is set to current branch
            remote_branch: "develop", # optional, default is set to local_branch
            force: true,    # optional, default: false
            force_with_lease: true,   # optional, default: false
            tags: false,    # optional, default: true
            no_verify: true,# optional, default: false
            set_upstream: true        # optional, default: false
       )
   end


  - you can add parameter as you want to here checkout this doc : 
  - [Fastlane](https://docs.fastlane.tools/actions/push_to_git_remote)



