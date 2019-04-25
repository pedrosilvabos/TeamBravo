<img src="https://media.licdn.com/dms/image/C4E0BAQEL8m3qNdzsnA/company-logo_200_200/0?e=2159024400&v=beta&t=T7-Ax16YixGc6Wkytr5RXyQjuFV_QLJn30D4m050B0k" />
<b>Please, commit frequently and push when you reach a functional milestone.</b>

<b>To start your git:</b>

git clone https://github.com/pedrosilvabos/teambravo.git

<pre>(the cloning creates all the connections and there is no more configurations needed)</pre>

<b>Available Branches:</b>

  <pre>
    ana<br/>
    master<br/>
    mesquita<br/>
    pedro<br/>
    silveira<br/>
    vasco<br/>
  </pre>

<b>Change branch:</b></br>
git checkout [your branch]

<b>Check what branch you are in:</b></br>
git branch -a </br>

<b>Commit your work:</b></br>
git add .</br>
git commit -m "your message"

<b><h1>git master control:</h1></b>
 <b> merge master into a branch: </b></br>
  git merge origin/master </br>
  
<b>Delete a branch on your local filesystem :</b></br>
git branch -d [name_of_your_new_branch]

<b>To force the deletion of local branch on your filesystem :</b></br>
git branch -D [name_of_your_new_branch]

<b>Delete the branch on github :</b></br>
git push origin :[name_of_your_new_branch]
