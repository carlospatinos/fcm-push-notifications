# fcm-push-notifications
Push notifications from the backend into the browser

# Build
We have 2 project, frontend and backend

## Frontend

Copy the template.env file into an .env file under frontend-pushapp/. This will contain firebase config values. The config can be obtained on firebase by creating a project and then a web application under that project

VITE_APP_API_KEY=""
VITE_APP_AUTH_DOMAIN=""
VITE_APP_PROJECT_ID=""
VITE_APP_STORAGE_BUCKET=""
VITE_APP_MESSAGING_SENDER_ID=""
VITE_APP_APP_ID=""
VITE_APP_VAPID_KEY=""


`sh
cd frontend-pushapp
npm install
npm run dev
`

## Backend 
Go into firebae, create a project, under projet settings -> service account generate the json file and put it in backend-pushapp/src/main/resources/fcm-credentials.json 
`sh
./mvnw clean install
./mvnw spring-boot:run
`


# Full video
1. [Part 1 - Front end application]([/guides/content/editing-an-existing-page](https://youtu.be/uI4mVtxiwnY))