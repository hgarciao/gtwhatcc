cd target
tar -cf gtw.tgz *.war
export SSHPASS=$DEPLOY_PASS
sshpass -e scp -o StrictHostKeyChecking=no gtw.tgz $DEPLOY_USER@$DEPLOY_HOST:$DEPLOY_PATH/gtw
sshpass -e ssh -f -o StrictHostKeyChecking=no $DEPLOY_USER@$DEPLOY_HOST $DEPLOY_PATH/gtw/deploy.sh
